package halodot.api.HaloApi.stats.ServiceRecord;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.math.BigDecimal;

public class Multiplayer {
    JSONObject data;

    public Multiplayer(String data) {
        JSONObject obj = null;
        try {
            obj = (JSONObject) new JSONParser().parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.data = obj != null ? (JSONObject) obj.get("data") : null;
    }


    //DATA//
    public long getMatchesPlayed() {
        return (long) data.get("matches_played");
    }

    public BigDecimal getWinRate() {
        return new BigDecimal(String.valueOf(data.get("win_rate")));
    }


    //CORE//
    private JSONObject getCore() {
        return (JSONObject) data.get("core");
    }

    public BigDecimal getKDA() {
        return new BigDecimal(String.valueOf(getCore().get("kda")));
    }

    public BigDecimal getKDR() {
        return new BigDecimal(String.valueOf(getCore().get("kdr")));
    }

    public long getTotalScore() {
        return (long) getCore().get("total_score");
    }


    //SUMMARY//
    private JSONObject getSummary() {
        return (JSONObject) getCore().get("summary");
    }

    public long getKills() {
        return (long) getSummary().get("kills");
    }

    public long getDeaths() {
        return (long) getSummary().get("deaths");
    }

    public long getAssists() {
        return (long) getSummary().get("assists");
    }

    public long getBetrayals() {
        return (long) getSummary().get("betrayals");
    }

    public long getSuicides() {
        return (long) getSummary().get("suicides");
    }

    public long getMedals() {
        return (long) getSummary().get("medals");
    }


    //SUMMARY.VEHICLES//
    private JSONObject getVehicles() {
        return (JSONObject) getSummary().get("vehicles");
    }

    public long getVehiclesDestroyed(){
        return (long) getVehicles().get("destroys");
    }

    public long getVehiclesHijacked(){
        return (long) getVehicles().get("hijacks");
    }


    //DAMAGE//
    private JSONObject getDamage() {
        return (JSONObject) getCore().get("damage");
    }

    public long getDamageTaken(){
        return (long) getDamage().get("taken");
    }

    public long getDamageDealt(){
        return (long) getDamage().get("dealt");
    }

    public long getDamageAverage(){
        return (long) getDamage().get("average");
    }


    //SHOTS//
    private JSONObject getShots() {
        return (JSONObject) getCore().get("shots");
    }

    public long getShotsFired(){
        return (long) getShots().get("fired");
    }

    public long getShotsLanded(){
        return (long) getShots().get("landed");
    }

    public long getShotsMissed(){
        return (long) getShots().get("missed");
    }

    public BigDecimal getShotsAccuracy() {
        return new BigDecimal(String.valueOf(getShots().get("accuracy")));
    }


    //BREAKDOWN.KILLS//
    private JSONObject getBreakdown() {
        return (JSONObject) getCore().get("breakdowns");
    }

    private JSONObject getBreakdownKills() {
        return (JSONObject) getBreakdown().get("kills");
    }

    public long getKillsMelee(){
        return (long) getBreakdownKills().get("melee");
    }

    public long getKillsGrenade(){
        return (long) getBreakdownKills().get("grenades");
    }

    public long getKillsHeadshot(){
        return (long) getBreakdownKills().get("headshots");
    }

    public long getKillsPowerWeapon(){
        return (long) getBreakdownKills().get("power_weapons");
    }


    //BREAKDOWN.ASSISTS//
    private JSONObject getBreakdownAssists() {
        return (JSONObject) getBreakdown().get("assists");
    }

    public long getAssistsEmp(){
        return (long) getBreakdownAssists().get("emp");
    }

    public long getAssistsDriver(){
        return (long) getBreakdownAssists().get("driver");
    }

    public long getAssistsCallout(){
        return (long) getBreakdownAssists().get("callouts");
    }


    //BREAKDOWN.MATCHES//
    private JSONObject getBreakdownMatches() {
        return (JSONObject) getBreakdown().get("matches");
    }

    public long getMatchesWon(){
        return (long) getBreakdownMatches().get("wins");
    }

    public long getMatchesLost(){
        return (long) getBreakdownMatches().get("losses");
    }

    public long getMatchesLeft(){
        return (long) getBreakdownMatches().get("left");
    }

    public long getMatchesDraw(){
        return (long) getBreakdownMatches().get("draws");
    }


    //TO DO MEDALS//


}