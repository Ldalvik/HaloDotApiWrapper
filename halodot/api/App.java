package halodot.api;

import halodot.api.HaloApi.HaloApi;
import halodot.api.HaloApi.stats.ServiceRecord.Multiplayer;
import halodot.api.HaloApi.stats.Stats;

import java.math.BigDecimal;

public class App 
{

    static String TOKEN ="tok_dev_ZFsZzjVwCRmuyGyQn3PA9dWQ7uwNufs31MXRZjEvJz9Zm8WAghJDtPZk15TLT9zp";
    static String VERSION ="0.3.3";
    public static void main( String[] args )
    {
        HaloApi api = new HaloApi(VERSION, TOKEN);
        Stats stats = api.getStats("hey%20root");





        /*


        String GAMETYPE_FILTER = "matchmade:pvp";

        Multiplayer multiplayer =  stats.getServiceRecord().getMultiplayer(GAMETYPE_FILTER);

        long pvp_matches_played = multiplayer.getMatchesPlayed();
        BigDecimal pvp_win_rate = multiplayer.getWinRate();

        BigDecimal pvp_kda = multiplayer.getKDA();
        BigDecimal pvp_kdr = multiplayer.getKDR();
        long pvp_total_score = multiplayer.getTotalScore();

        long pvp_kills = multiplayer.getKills();
        long pvp_deaths = multiplayer.getDeaths();
        long pvp_assists = multiplayer.getAssists();
        long pvp_betrayals = multiplayer.getBetrayals();
        long pvp_suicides = multiplayer.getSuicides();
        long pvp_medals = multiplayer.getMedals();

        long pvp_vehicles_destroyed = multiplayer.getVehiclesDestroyed();
        long pvp_vehicles_hijacked = multiplayer.getVehiclesHijacked();

        long pvp_damage_taken = multiplayer.getDamageTaken();
        long pvp_damage_dealt = multiplayer.getDamageDealt();
        long pvp_damage_average = multiplayer.getDamageAverage();

        long pvp_shots_fired = multiplayer.getShotsFired();
        long pvp_shots_landed = multiplayer.getShotsLanded();
        long pvp_shots_missed = multiplayer.getShotsMissed();
        BigDecimal pvp_shots_accuracy = multiplayer.getShotsAccuracy();

        long pvp_melee_kills = multiplayer.getKillsMelee();
        long pvp_grenade_kills = multiplayer.getKillsGrenade();
        long pvp_headshot_kills = multiplayer.getKillsHeadshot();
        long pvp_powerweapon_kills = multiplayer.getKillsPowerWeapon();

        long pvp_emp_assists = multiplayer.getAssistsEmp();
        long pvp_driver_assists = multiplayer.getAssistsDriver();
        long pvp_callout_assists = multiplayer.getAssistsCallout();

        long pvp_matches_won = multiplayer.getMatchesWon();
        long pvp_matches_lost = multiplayer.getMatchesLost();
        long pvp_matches_left = multiplayer.getMatchesLeft();
        long pvp_matches_draw = multiplayer.getMatchesDraw();




        System.out.println("pvp_matches_played  " + pvp_matches_played);
        System.out.println("pvp_win_rate  " + pvp_win_rate);
        System.out.println("pvp_kda  " + pvp_kda);
        System.out.println("pvp_kdr  " + pvp_kdr);
        System.out.println("pvp_total_score  " + pvp_total_score);
        System.out.println("pvp_kills  " + pvp_kills);
        System.out.println("pvp_deaths  " + pvp_deaths);
        System.out.println("pvp_assists  " + pvp_assists);
        System.out.println("pvp_betrayals  " + pvp_betrayals);
        System.out.println("pvp_suicides  " + pvp_suicides);
        System.out.println("pvp_medals  " + pvp_medals);
        System.out.println("pvp_vehicles_destroyed  " + pvp_vehicles_destroyed);
        System.out.println("pvp_vehicles_hijacked  " + pvp_vehicles_hijacked);
        System.out.println("pvp_damage_taken  " + pvp_damage_taken);
        System.out.println("pvp_damage_dealt  " + pvp_damage_dealt);
        System.out.println("pvp_damage_average  " + pvp_damage_average);
        System.out.println("pvp_shots_fired  " + pvp_shots_fired);
        System.out.println("pvp_shots_landed  " + pvp_shots_landed);
        System.out.println("pvp_shots_missed  " + pvp_shots_missed);
        System.out.println("pvp_shots_accuracy  " + pvp_shots_accuracy);
        System.out.println("pvp_melee_kills  " + pvp_melee_kills);
        System.out.println("pvp_grenade_kills  " + pvp_grenade_kills);
        System.out.println("pvp_headshot_kills  " + pvp_headshot_kills);
        System.out.println("pvp_powerweapon_kills  " + pvp_powerweapon_kills);
        System.out.println("pvp_emp_assists  " + pvp_emp_assists);
        System.out.println("pvp_driver_assists  " + pvp_driver_assists);
        System.out.println("pvp_callout_assists  " + pvp_callout_assists);
        System.out.println("pvp_matches_won  " + pvp_matches_won);
        System.out.println("pvp_matches_lost  " + pvp_matches_lost);
        System.out.println("pvp_matches_left  " + pvp_matches_left);
        System.out.println("pvp_matches_draw  " + pvp_matches_draw);



        CSRS csrs = stats.getCSRS(1);


        long count = csrs.getCount();
        System.out.println("JSON data: " + csrs);

        int i=0;
        while (i<count) {
            String input = csrs.getInput(i);
            long matches_remaining = csrs.getMatchesRemaining(i);
            String queue = csrs.getQueue(i);
            String tier = csrs.getTier(i);
            long value = csrs.getValue(i);
            System.out.println("////////////////////////ITEM " + i + "////////////////////////");
            System.out.println("Input: " + input);
            System.out.println("Matches remaining: " + matches_remaining);
            System.out.println("queue: " + queue);
            System.out.println("Tier: " + tier);
            System.out.println("Value (Rank): " + value);
            i++;
        }
        */

        /* Articles articles = api.getArticles(HaloApi.EN_US);

        long count = articles.getCount();
        System.out.println("JSON data: " + articles);

        for(int i=0; i<count; i++) {
            String title = articles.getTitle(i);
            String subtitle = articles.getSubTitle(i);
            String message = articles.getMessage(i);
            String image_url = articles.getImageURL(i);
            System.out.println("////////////////////////ARTICLE " + i + "////////////////////////");
            System.out.println("Title: " + title);
            System.out.println("Subtitle: " + subtitle);
            System.out.println("Message: " + message);
            System.out.println("Image URL: " + image_url);

        }
        */




       /*

       Appearance appearance = api.getAppearance("hey root");

        String service_tag = appearance.getServiceTag();
        String background_image_url = appearance.getBackdropImageUrl();
        String emblem_url = appearance.getEmblemUrl();

        System.out.println("JSON data: " + appearance);
        System.out.println("Service tag: " + service_tag);
        System.out.println("Background image URL: " + background_image_url);
        System.out.println("Emblem URL: " + emblem_url);

        */
    }

}
