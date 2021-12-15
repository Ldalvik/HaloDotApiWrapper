package halodot.api.HaloApi.stats;

import halodot.api.HaloApi.HaloApi;
import halodot.api.HaloApi.Utils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CSRS {
    JSONArray data;

    public CSRS(String data) {
        JSONObject obj = null;
        try {
            obj = (JSONObject) new JSONParser().parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.data = obj != null ? (JSONArray) obj.get("data") : null;
    }

    public long getCount(){
        return data.size();
    }

    public long getMatchesRemaining(int count){
        return (long) getCurrent(count).get("measurement_matches_remaining");
    }

    public String getQueue(int count){
        return Utils.getObjStr(data, count,"queue");
    }

    public String getInput(int count){
        return Utils.getObjStr(data, count,"input");
    }

    public long getValue(int count){
        return (long) getCurrent(count).get("value");
    }

    public String getTier(int count){
        return (String) getCurrent(count).get("tier");
    }

    private JSONObject getCurrent(int count){
        JSONObject obj = (JSONObject) data.get(count);
        JSONObject obj2 = (JSONObject) obj.get("response");
        return (JSONObject) obj2.get("current");
    }

    private JSONObject getSeason(int count){
        JSONObject obj = (JSONObject) data.get(count);
        JSONObject obj2 = (JSONObject) obj.get("response");
        return (JSONObject) obj2.get("season");
    }

    @Override
    public String toString(){
        return data.toJSONString();
    }
}
