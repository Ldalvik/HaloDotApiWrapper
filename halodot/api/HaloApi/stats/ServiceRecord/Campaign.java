package halodot.api.HaloApi.stats.ServiceRecord;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Campaign {
    JSONObject data;

    public Campaign(String data){
        JSONObject obj = null;
        try {
            obj = (JSONObject) new JSONParser().parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.data = obj != null ? (JSONObject) obj.get("data") : null;
    }




}
