package halodot.api.HaloApi;

import halodot.api.HaloApi.stats.Stats;
import halodot.api.http.HaloHttp;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class HaloApi {
    public static String AUTH_TOKEN;
    public static String VERSION;

    public static String BTB = "btb";
    public static String PVE_BOTS = "pve-bots";
    public static String ARENA ="arena";
    public static String FEATURED = "featured";
    public static String CUSTOM ="custom";
    public static String RANKED_ALL ="ranked:all";
    public static String RANKED_OPEN_CROSSPLAY ="ranked:open:crossplay";
    public static String RANKED_SOLODUO_CONTROLLER ="ranked:solo-duo:controller";
    public static String RANKED_SOLODUO_MNK ="ranked:solo-duo:mnk";

    public static String EN_US = "en-US";

    public HaloApi(String version, String auth_token){
        AUTH_TOKEN = "Bearer " + auth_token;
        VERSION = version;
    }

    public Appearance getAppearance(String gamertag) {
        String data = null;
        try {
            data = HaloHttp.get("https://halo.api.stdlib.com/infinite@" + VERSION + "/appearance/","?gamertag=" + gamertag, AUTH_TOKEN);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert data != null;
        return new Appearance(data);
    }

    public Articles getArticles(String language) {
        String data = null;
        try {
            data = HaloHttp.get("https://halo.api.stdlib.com/infinite@" + VERSION + "/articles/","?language=" + language, AUTH_TOKEN);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Articles(data);
    }

    public Stats getStats(String gamertag){
        return new Stats(gamertag);
    }


}
