package halodot.api.HaloApi;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Articles {
    JSONObject data;
    JSONArray data_arr;

        public Articles(String data) {
        JSONObject obj = null;
        try {
            obj = (JSONObject) new JSONParser().parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.data = obj;
        this.data_arr = obj != null ? (JSONArray) obj.get("data") : null;
    }

    public long getCount(){
        return (long) data.get("count");
    }

    public String getTitle(int count){
        JSONObject obj = (JSONObject) data_arr.get(count);
        return (String) obj.get("title");
    }

    public String getSubTitle(int count){
        JSONObject obj = (JSONObject) data_arr.get(count);
        return (String) obj.get("subtitle");
    }

    public String getMessage(int count){
        JSONObject obj = (JSONObject) data_arr.get(count);
        return (String) obj.get("message");
    }

    public String getImageURL(int count){
        JSONObject obj = (JSONObject) data_arr.get(count);
        return (String) obj.get("image_url");
    }

    @Override
    public String toString(){
        return data.toJSONString();
    }
}
