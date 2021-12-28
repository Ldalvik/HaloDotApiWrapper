package halodot.api.HaloApi.stats.ServiceRecord;

import halodot.api.HaloApi.HaloApi;
import halodot.api.http.HaloHttp;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.math.BigDecimal;

public class ServiceRecord {
    String gamertag;

    public ServiceRecord(String gamertag) {
        this.gamertag = gamertag;
    }

    public Multiplayer getMultiplayer(String filter){
        String data = null;
        try {
            data = HaloHttp.get("https://halo.api.stdlib.com/infinite@" + HaloApi.VERSION + "/stats/service-record/multiplayer","?gamertag=" + gamertag + "&filter=" + filter, HaloApi.AUTH_TOKEN);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Multiplayer(data);
    }

    public Campaign getMultiplayer(){
        String data = null;
        try {
            data = HaloHttp.get("https://halo.api.stdlib.com/infinite@" + HaloApi.VERSION + "/stats/service-record/campaign","?gamertag=" + gamertag, HaloApi.AUTH_TOKEN);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Campaign(data);
    }



}
