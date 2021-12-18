package halodot.api.HaloApi.stats;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.math.BigDecimal;

public class ServiceRecord {


    JSONObject data;

    public ServiceRecord(String data) {
        JSONObject obj = null;
        try {
            obj = (JSONObject) new JSONParser().parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.data = obj != null ? (JSONObject) obj.get("data") : null;
    }

    public long getMatchesPlayed(){
        return (long) data.get("matches_played");
    }
    public BigDecimal getWinRate(){
        return new BigDecimal(String.valueOf(data.get("win_rate")));
    }



}
