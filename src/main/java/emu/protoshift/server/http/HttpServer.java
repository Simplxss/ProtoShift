package emu.protoshift.server.http;

import emu.protoshift.ProtoShift;
import emu.protoshift.config.Configuration;
import emu.protoshift.utils.FileUtils;

import io.javalin.Javalin;
import io.javalin.http.ContentType;
import io.javalin.json.JavalinGson;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.util.ssl.SslContextFactory;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Manages all HTTP-related classes.
 * (including dispatch, announcements, gacha, etc.)
 */
public final class HttpServer {
    private final Javalin javalin;

    /**
     * Configures the Javalin application.
     */
    public HttpServer() {
        this.javalin = Javalin.create(config -> {
            // Set the Javalin HTTP server.
            config.jetty.server(HttpServer::createServer);

            // Configure encryption/HTTPS/SSL.
            if (Configuration.HTTP.encryption.useEncryption)
                config.plugins.enableSslRedirects();

            // Configure HTTP policies.
            if (Configuration.HTTP.policies.cors.enabled) {
                var allowedOrigins = Configuration.HTTP.policies.cors.allowedOrigins;
                config.plugins.enableCors(cors -> cors.add(corsConfig -> {
                    if (allowedOrigins.length > 0) {
                        if (Arrays.asList(allowedOrigins).contains("*"))
                            corsConfig.anyHost();
                        else corsConfig.allowHost(Arrays.toString(allowedOrigins));
                    } else corsConfig.anyHost();
                }));
            }

            // Configure debug logging.
            if (Configuration.DEBUG_MODE_INFO == Configuration.DebugMode.ALL)
                config.plugins.enableDevLogging();

            // Set the JSON mapper.
            config.jsonMapper(new JavalinGson());

            // Static files should be added like this https://javalin.io/documentation#static-files
        });

        this.javalin.exception(Exception.class, (exception, ctx) -> {
            ctx.status(500).result("Internal server error. %s"
                .formatted(exception.getMessage()));
            ProtoShift.getLogger().debug("Exception thrown: " +
                exception.getMessage(), exception);
        });
    }

    /**
     * Creates an HTTP(S) server.
     *
     * @return A server instance.
     */
    @SuppressWarnings("resource")
    private static Server createServer() {
        Server server = new Server();
        ServerConnector serverConnector
            = new ServerConnector(server);

        if (Configuration.HTTP.encryption.useEncryption) {
            var sslContextFactory = new SslContextFactory.Server();
            var keystoreFile = new File(Configuration.HTTP.encryption.keystore);

            if (!keystoreFile.exists()) {
                Configuration.HTTP.encryption.useEncryption = false;
                Configuration.HTTP.encryption.useInRouting = false;

                ProtoShift.getLogger().warn(translate("messages.dispatch.keystore.no_keystore_error"));
            } else try {
                sslContextFactory.setKeyStorePath(keystoreFile.getPath());
                sslContextFactory.setKeyStorePassword(Configuration.HTTP.encryption.keystorePassword);
            } catch (Exception ignored) {
                ProtoShift.getLogger().warn(translate("messages.dispatch.keystore.password_error"));

                try {
                    sslContextFactory.setKeyStorePath(keystoreFile.getPath());
                    sslContextFactory.setKeyStorePassword("123456");
                    sslContextFactory.setSniRequired(false);

                    ProtoShift.getLogger().warn(translate("messages.dispatch.keystore.default_password"));
                } catch (Exception exception) {
                    ProtoShift.getLogger().warn(translate("messages.dispatch.keystore.general_error"), exception);
                }
            } finally {
                serverConnector = new ServerConnector(server, sslContextFactory);
            }
        }

        serverConnector.setPort(Configuration.HTTP.bindPort);
        serverConnector.setHost(Configuration.HTTP.bindAddress);
        server.setConnectors(new ServerConnector[]{serverConnector});

        return server;
    }

    /**
     * Returns the handle for the Express application.
     *
     * @return A Javalin instance.
     */
    public Javalin getHandle() {
        return this.javalin;
    }

    /**
     * Initializes the provided class.
     *
     * @param router The router class.
     * @return Method chaining.
     */
    @SuppressWarnings("UnusedReturnValue")
    public HttpServer addRouter(Class<? extends Router> router, Object... args) {
        // Get all constructor parameters.
        var types = new Class<?>[args.length];
        for (var argument : args)
            types[args.length - 1] = argument.getClass();

        try { // Create a router instance & apply routes.
            var constructor = router.getDeclaredConstructor(types); // Get the constructor.
            var routerInstance = constructor.newInstance(args); // Create instance.
            routerInstance.applyRoutes(this.javalin); // Apply routes.
        } catch (Exception exception) {
            ProtoShift.getLogger().warn(translate("messages.dispatch.router_error"), exception);
        }
        return this;
    }

    /**
     * Starts listening on the HTTP server.
     */
    public void start() throws UnsupportedEncodingException {
        // Attempt to start the HTTP server.
        if (Configuration.HTTP.bindAddress.isEmpty()) {
            this.javalin.start(Configuration.HTTP.bindPort);
        } else {
            this.javalin.start(Configuration.HTTP.bindAddress, Configuration.HTTP.bindPort);
        }

        // Log bind information.
        ProtoShift.getLogger().info(translate("messages.dispatch.address_bind", HTTP_INFO.accessAddress, this.javalin.port()));
    }
}
