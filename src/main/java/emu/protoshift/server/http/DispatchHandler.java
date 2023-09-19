package emu.protoshift.server.http;

import emu.protoshift.ProtoShift;
import emu.protoshift.config.Configuration;

import io.javalin.Javalin;
import io.javalin.http.Context;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.util.Base64;

public class DispatchHandler implements Router  {
    public DispatchHandler() {
        try {
            OkHttpClient client = new OkHttpClient();

            // Request upstream server for region list.
            Request request = new Request.Builder()
                    .url(Configuration.DISPATCH_SERVER.address + "/query_region_list")
                    .build();

            try (Response response = client.newCall(request).execute()) {
                assert response.body() != null;
                Base64.getDecoder().decode(response.body().string());
            }

            // Request upstream server for current region.
        } catch (Exception exception) {
            ProtoShift.getLogger().error("Failed to initialize region data.", exception);
        }
    }

    @Override
    public void applyRoutes(Javalin javalin) {
        javalin.get("/query_region_list", DispatchHandler::queryRegionList);
        javalin.get("/query_cur_region", DispatchHandler::queryCurrentRegion);
    }

    /**
     * Handle query region list request.
     *
     * @param ctx The context object for handling the request.
     * @route /query_region_list
     */
    private static void queryRegionList(Context ctx) {


    }

    /**
     * @route /query_cur_region
     */
    private static void queryCurrentRegion(Context ctx) {

    }
}
