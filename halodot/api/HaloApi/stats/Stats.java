package halodot.api.HaloApi.stats;

import halodot.api.HaloApi.HaloApi;
import halodot.api.http.HaloHttp;

import java.io.IOException;

public class Stats {
    String gamertag;

    public Stats(String gamertag){
        this.gamertag = gamertag;
    }

    public CSRS getCSRS(int season){
        String data = null;
        try {
            data = HaloHttp.get("https://halo.api.stdlib.com/infinite@" + HaloApi.VERSION + "/stats/csrs/","{\"gamertag\":\"" + gamertag + "\",\"season\":" + season + "}", HaloApi.AUTH_TOKEN);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new CSRS(data);
    }
}
