package halodot.api.HaloApi;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Utils {

    public static String getObjStr(JSONArray data, int count, String key){
        JSONObject obj = (JSONObject) data.get(count);
        return (String) obj.get(key);
    }
    public static int getObjInt(JSONArray data, int count, String key){
        JSONObject obj = (JSONObject) data.get(count);
        return (int) obj.get(key);
    }

}
