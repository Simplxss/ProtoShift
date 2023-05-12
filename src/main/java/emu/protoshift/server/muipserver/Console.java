package emu.protoshift.server.muipserver;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import emu.protoshift.ProtoShift;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class Console {
    public static String exec(int uid, String cmd) {
        try {
            URL url = new URL(ProtoShift.getConfig().remote.muipserver.address + "?cmd=1116&uid=" + uid + "&msg=" + cmd + "&region=" + ProtoShift.getConfig().remote.muipserver.region + "&ticket=YSGM@" + new Date().getTime());
            var connection = (HttpURLConnection) url.openConnection();

            if (connection.getResponseCode() == 200) {
                var in = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));
                JsonObject jsonObject = JsonParser.parseReader(in).getAsJsonObject();
                String response = "retcode: " + jsonObject.get("retcode").getAsString() + "\n";
                if (jsonObject.has("data"))
                    response += "retmsg: " + jsonObject.getAsJsonObject("data").get("retmsg").getAsString();
                else
                    response += "msg: " + jsonObject.get("msg").getAsString();
                return response;
            } else return "HTTP Error, Code: " + connection.getResponseCode();
        } catch (Exception e) {
            e.printStackTrace();
            return "ERROR!!Please contact the administrator!";
        }
    }
}
