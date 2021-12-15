package halodot.api.HaloApi;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Appearance {
    JSONObject data;

    public Appearance(String data) {
        JSONObject obj = null;
        try {
            obj = (JSONObject) new JSONParser().parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.data = (JSONObject) (obj != null ? obj.get("data") : null);
    }

    public String getEmblemUrl(){
        return (String) data.get("emblem_url");
    }

    public String getBackdropImageUrl(){
        return (String) data.get("backdrop_image_url");
    }

    public String getServiceTag(){
        return (String) data.get("service_tag");
    }

    @Override
    public String toString(){
        return data.toJSONString();
    }
}
