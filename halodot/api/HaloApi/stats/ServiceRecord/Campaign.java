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

    public long getSkullsFound(){
        return (long) data.get("skulls");
    }
    public long getFobsSecured(){
        return (long) data.get("fob_secured");
    }
    public long getSpartanCoresFound(){
        return (long) data.get("spartan_cores");
    }
    public long getPropagandaTowersDestroyed(){
        return (long) data.get("propaganda_towers_destroyed");
    }
    public long getMissionsCompleted(){
        return (long) data.get("mission_completed");
    }
    public long getUNSCAudioLogsFound(){
        JSONObject obj = (JSONObject) data.get("audio_logs");
        return (long) obj.get("unsc");
    }
    public long getSpartanAudioLogsFound(){
        JSONObject obj = (JSONObject) data.get("audio_logs");
        return (long) obj.get("spartans");
    }
    public long getBanishedAudioLogsFound(){
        JSONObject obj = (JSONObject) data.get("audio_logs");
        return (long) obj.get("banished");
    }
    public String getHighestDifficultyCompleted(){
        JSONObject obj = (JSONObject) data.get("difficulty");
        return (String) obj.get("highest_completed");
    }
    public String getHighestDifficultyImageURL(){
        JSONObject obj = (JSONObject) data.get("audio_logs");
        return (String) obj.get("spartan");
    }
    public boolean getLasoCompleted(){
        JSONObject obj = (JSONObject) data.get("difficulty");
        return (boolean) obj.get("laso_completed");
    }

}
