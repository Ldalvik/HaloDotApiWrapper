package halodot.api.HaloApi.stats;

import halodot.api.HaloApi.HaloApi;
import halodot.api.HaloApi.Utils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CSRS {
    JSONArray data;

    public static int OPEN_CROSSPLAY = 0;
    public static int SOLO_DUO_CONTROLLER = 1;
    public static int SOLO_DUO_MNK = 2;

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

    public String getQueue(int count){
        return Utils.getObjStr(data, count,"queue");
    }

    public String getInput(int count){
        return Utils.getObjStr(data, count,"input");
    }


    //CURRENT//
    private JSONObject getCurrent(int count){
        JSONObject obj = (JSONObject) data.get(count);
        JSONObject obj2 = (JSONObject) obj.get("response");
        return (JSONObject) obj2.get("current");
    }

    public long getCurrentValue(int count){
        return (long) getCurrent(count).get("value");
    }

    public long getCurrentMatchesRemaining(int count){
        return (long) getCurrent(count).get("measurement_matches_remaining");
    }

    public String getCurrentTier(int count){
        return (String) getCurrent(count).get("tier");
    }

    public long getCurrentTierStart(int count){
        return (long) getCurrent(count).get("tier_start");
    }

    public long getCurrentSubTier(int count){
        return (long) getCurrent(count).get("sub_tier");
    }

    public long getCurrentNextTierStart(int count){
        return (long) getCurrent(count).get("next_tier_start");
    }

    public long getCurrentNextSubTier(int count){
        return (long) getCurrent(count).get("next_sub_tier");
    }

    public long getCurrentInitialMeasurementMatches(int count){
        return (long) getCurrent(count).get("initial_measurement_matches");
    }

    public String getCurrentTierImageUrl(int count){
        return (String) getCurrent(count).get("tier_image_url");
    }


    //SEASON//
    private JSONObject getSeason(int count){
        JSONObject obj = (JSONObject) data.get(count);
        JSONObject obj2 = (JSONObject) obj.get("response");
        return (JSONObject) obj2.get("season");
    }

    public long getSeasonValue(int count){
        return (long) getSeason(count).get("value");
    }

    public long getSeasonMatchesRemaining(int count){
        return (long) getSeason(count).get("measurement_matches_remaining");
    }

    public String getSeasonTier(int count){
        return (String) getSeason(count).get("tier");
    }

    public long getSeasonTierStart(int count){
        return (long) getSeason(count).get("tier_start");
    }

    public long getSeasonSubTier(int count){
        return (long) getSeason(count).get("sub_tier");
    }

    public long getSeasonNextTierStart(int count){
        return (long) getSeason(count).get("next_tier_start");
    }

    public long getSeasonNextSubTier(int count){
        return (long) getSeason(count).get("next_sub_tier");
    }

    public long getSeasonInitialMeasurementMatches(int count){
        return (long) getSeason(count).get("initial_measurement_matches");
    }

    public String getSeasonTierImageUrl(int count){
        return (String) getSeason(count).get("tier_image_url");
    }

    //ALL-TIME//
    private JSONObject getAllTime(int count){
        JSONObject obj = (JSONObject) data.get(count);
        JSONObject obj2 = (JSONObject) obj.get("response");
        return (JSONObject) obj2.get("all_time");
    }

    public long getAllTimeValue(int count){
        return (long) getAllTime(count).get("value");
    }

    public long getAllTimeMatchesRemaining(int count){
        return (long) getAllTime(count).get("measurement_matches_remaining");
    }

    public String getAllTimeTier(int count){
        return (String) getAllTime(count).get("tier");
    }

    public long getAllTimeTierStart(int count){
        return (long) getAllTime(count).get("tier_start");
    }

    public long getAllTimeSubTier(int count){
        return (long) getAllTime(count).get("sub_tier");
    }

    public long getAllTimeNextTierStart(int count){
        return (long) getAllTime(count).get("next_tier_start");
    }

    public long getAllTimeNextSubTier(int count){
        return (long) getAllTime(count).get("next_sub_tier");
    }

    public long getAllTimeInitialMeasurementMatches(int count){
        return (long) getAllTime(count).get("initial_measurement_matches");
    }

    public String getAllTimeTierImageUrl(int count){
        return (String) getAllTime(count).get("tier_image_url");
    }


    @Override
    public String toString(){
        return data.toJSONString();
    }
}
