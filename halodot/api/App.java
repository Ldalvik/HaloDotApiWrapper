package halodot.api;

import halodot.api.HaloApi.HaloApi;
import halodot.api.HaloApi.stats.CSRS;
import halodot.api.HaloApi.stats.ServiceRecord.Multiplayer;
import halodot.api.HaloApi.stats.Stats;

import java.math.BigDecimal;

public class App 
{

    static String TOKEN ="tok_dev_Ambv9VSB1nSn2gt4dz2Pj2xfjseSswG2KfYNcp68qBiKfRM8fLptGrkg6hirq2Tg";
    static String VERSION ="0.3.3";
    public static void main( String[] args )
    {
        HaloApi api = new HaloApi(VERSION, TOKEN);
        Stats stats = api.getStats("hey%20root");





        /*
        
        CSRS csrs = stats.getCSRS(1);

        long count = csrs.getCount();
        //System.out.println("JSON data: " + csrs);
        int CSRS_GAMETYPE = CSRS.SOLO_DUO_CONTROLLER;

        String input                               = csrs.getInput(CSRS_GAMETYPE);
        String queue                               = csrs.getQueue(CSRS_GAMETYPE);
        long   current_value                       = csrs.getCurrentValue(CSRS_GAMETYPE);
        long   current_matches_remaining           = csrs.getCurrentMatchesRemaining(CSRS_GAMETYPE);
        String current_tier                        = csrs.getCurrentTier(CSRS_GAMETYPE);
        long   current_tier_start                  = csrs.getCurrentTierStart(CSRS_GAMETYPE);
        long   current_sub_tier                    = csrs.getCurrentSubTier(CSRS_GAMETYPE);
        long   current_next_tier_start             = csrs.getCurrentNextTierStart(CSRS_GAMETYPE);
        long   current_next_sub_tier               = csrs.getCurrentNextSubTier(CSRS_GAMETYPE);
        long   current_initial_measurement_matches = csrs.getCurrentInitialMeasurementMatches(CSRS_GAMETYPE);
        String current_tier_image_url              = csrs.getCurrentTierImageUrl(CSRS_GAMETYPE);

        long   season_value                        = csrs.getSeasonValue(CSRS_GAMETYPE);
        long   season_matches_remaining            = csrs.getSeasonMatchesRemaining(CSRS_GAMETYPE);
        String season_tier                         = csrs.getSeasonTier(CSRS_GAMETYPE);
        long   season_tier_start                   = csrs.getSeasonTierStart(CSRS_GAMETYPE);
        long   season_sub_tier                     = csrs.getSeasonSubTier(CSRS_GAMETYPE);
        long   season_next_tier_start              = csrs.getSeasonNextTierStart(CSRS_GAMETYPE);
        long   season_next_sub_tier                = csrs.getSeasonNextSubTier(CSRS_GAMETYPE);
        long   season_initial_measurement_matches  = csrs.getSeasonInitialMeasurementMatches(CSRS_GAMETYPE);
        String season_tier_image_url               = csrs.getSeasonTierImageUrl(CSRS_GAMETYPE);

        long   alltime_value                       = csrs.getAllTimeValue(CSRS_GAMETYPE);
        long   alltime_matches_remaining           = csrs.getAllTimeMatchesRemaining(CSRS_GAMETYPE);
        String alltime_tier                        = csrs.getAllTimeTier(CSRS_GAMETYPE);
        long   alltime_tier_start                  = csrs.getAllTimeTierStart(CSRS_GAMETYPE);
        long   alltime_sub_tier                    = csrs.getAllTimeSubTier(CSRS_GAMETYPE);
        long   alltime_next_tier_start             = csrs.getAllTimeNextTierStart(CSRS_GAMETYPE);
        long   alltime_next_sub_tier               = csrs.getAllTimeNextSubTier(CSRS_GAMETYPE);
        long   alltime_initial_measurement_matches = csrs.getAllTimeInitialMeasurementMatches(CSRS_GAMETYPE);
        String alltime_tier_image_url              = csrs.getAllTimeTierImageUrl(CSRS_GAMETYPE);



        System.out.println("input                                  " + input);
        System.out.println("queue                                  " + queue);
        System.out.println("current_value                          " + current_value);
        System.out.println("current_matches_remaining              " + current_matches_remaining);
        System.out.println("current_tier                           " + current_tier);
        System.out.println("current_tier_start                     " + current_tier_start);
        System.out.println("current_sub_tier                       " + current_sub_tier);
        System.out.println("current_next_tier_start                " + current_next_tier_start);
        System.out.println("current_next_sub_tier                  " + current_next_sub_tier);
        System.out.println("current_initial_measurement_matches    " + current_initial_measurement_matches);
        System.out.println("current_tier_image_url                 " + current_tier_image_url);

        System.out.println("season_value                           " + season_value);
        System.out.println("season_matches_remaining               " + season_matches_remaining);
        System.out.println("season_tier                            " + season_tier);
        System.out.println("season_tier_start                      " + season_tier_start);
        System.out.println("season_sub_tier                        " + season_sub_tier);
        System.out.println("season_next_tier_start                 " + season_next_tier_start);
        System.out.println("season_next_sub_tier                   " + season_next_sub_tier);
        System.out.println("season_initial_measurement_matches     " + season_initial_measurement_matches);
        System.out.println("season_tier_image_url                  " + season_tier_image_url);

        System.out.println("alltime_value                          " + alltime_value);
        System.out.println("alltime_matches_remaining              " + alltime_matches_remaining);
        System.out.println("alltime_tier                           " + alltime_tier);
        System.out.println("alltime_tier_start                     " + alltime_tier_start);
        System.out.println("alltime_sub_tier                       " + alltime_sub_tier);
        System.out.println("alltime_next_tier_start                " + alltime_next_tier_start);
        System.out.println("alltime_next_sub_tier                  " + alltime_next_sub_tier);
        System.out.println("alltime_initial_measurement_matches    " + alltime_initial_measurement_matches);
        System.out.println("alltime_tier_image_url                 " + alltime_tier_image_url);



        String GAMETYPE_FILTER = Multiplayer.MATCHMADE_PVP;

        Multiplayer multiplayer =  stats.getServiceRecord().getMultiplayer(GAMETYPE_FILTER);

        long       pvp_matches_played       = multiplayer.getMatchesPlayed();
        BigDecimal pvp_win_rate             = multiplayer.getWinRate();

        BigDecimal pvp_kda                  = multiplayer.getKDA();
        BigDecimal pvp_kdr                  = multiplayer.getKDR();
        long       pvp_total_score          = multiplayer.getTotalScore();

        long       pvp_kills                = multiplayer.getKills();
        long       pvp_deaths               = multiplayer.getDeaths();
        long       pvp_assists              = multiplayer.getAssists();
        long       pvp_betrayals            = multiplayer.getBetrayals();
        long       pvp_suicides             = multiplayer.getSuicides();
        long       pvp_medals               = multiplayer.getMedals();

        long       pvp_vehicles_destroyed   = multiplayer.getVehiclesDestroyed();
        long       pvp_vehicles_hijacked    = multiplayer.getVehiclesHijacked();

        long       pvp_damage_taken         = multiplayer.getDamageTaken();
        long       pvp_damage_dealt         = multiplayer.getDamageDealt();
        long       pvp_damage_average       = multiplayer.getDamageAverage();

        long       pvp_shots_fired          = multiplayer.getShotsFired();
        long       pvp_shots_landed         = multiplayer.getShotsLanded();
        long       pvp_shots_missed         = multiplayer.getShotsMissed();
        BigDecimal pvp_shots_accuracy       = multiplayer.getShotsAccuracy();

        long       pvp_melee_kills          = multiplayer.getKillsMelee();
        long       pvp_grenade_kills        = multiplayer.getKillsGrenade();
        long       pvp_headshot_kills       = multiplayer.getKillsHeadshot();
        long       pvp_powerweapon_kills    = multiplayer.getKillsPowerWeapon();

        long       pvp_emp_assists          = multiplayer.getAssistsEmp();
        long       pvp_driver_assists       = multiplayer.getAssistsDriver();
        long       pvp_callout_assists      = multiplayer.getAssistsCallout();

        long       pvp_matches_won          = multiplayer.getMatchesWon();
        long       pvp_matches_lost         = multiplayer.getMatchesLost();
        long       pvp_matches_left         = multiplayer.getMatchesLeft();
        long       pvp_matches_draw         = multiplayer.getMatchesDraw();




        System.out.println("pvp_matches_played     " + pvp_matches_played);
        System.out.println("pvp_win_rate           " + pvp_win_rate);
        System.out.println("pvp_kda                " + pvp_kda);
        System.out.println("pvp_kdr                " + pvp_kdr);
        System.out.println("pvp_total_score        " + pvp_total_score);
        System.out.println("pvp_kills              " + pvp_kills);
        System.out.println("pvp_deaths             " + pvp_deaths);
        System.out.println("pvp_assists            " + pvp_assists);
        System.out.println("pvp_betrayals          " + pvp_betrayals);
        System.out.println("pvp_suicides           " + pvp_suicides);
        System.out.println("pvp_medals             " + pvp_medals);
        System.out.println("pvp_vehicles_destroyed " + pvp_vehicles_destroyed);
        System.out.println("pvp_vehicles_hijacked  " + pvp_vehicles_hijacked);
        System.out.println("pvp_damage_taken       " + pvp_damage_taken);
        System.out.println("pvp_damage_dealt       " + pvp_damage_dealt);
        System.out.println("pvp_damage_average     " + pvp_damage_average);
        System.out.println("pvp_shots_fired        " + pvp_shots_fired);
        System.out.println("pvp_shots_landed       " + pvp_shots_landed);
        System.out.println("pvp_shots_missed       " + pvp_shots_missed);
        System.out.println("pvp_shots_accuracy     " + pvp_shots_accuracy);
        System.out.println("pvp_melee_kills        " + pvp_melee_kills);
        System.out.println("pvp_grenade_kills      " + pvp_grenade_kills);
        System.out.println("pvp_headshot_kills     " + pvp_headshot_kills);
        System.out.println("pvp_powerweapon_kills  " + pvp_powerweapon_kills);
        System.out.println("pvp_emp_assists        " + pvp_emp_assists);
        System.out.println("pvp_driver_assists     " + pvp_driver_assists);
        System.out.println("pvp_callout_assists    " + pvp_callout_assists);
        System.out.println("pvp_matches_won        " + pvp_matches_won);
        System.out.println("pvp_matches_lost       " + pvp_matches_lost);
        System.out.println("pvp_matches_left       " + pvp_matches_left);
        System.out.println("pvp_matches_draw       " + pvp_matches_draw);



        Articles articles = api.getArticles(HaloApi.EN_US);

        long count = articles.getCount();
        //System.out.println("JSON data: " + articles);

        for(int i=0; i<count; i++) {
            String title     = articles.getTitle(i);
            String subtitle  = articles.getSubTitle(i);
            String message   = articles.getMessage(i);
            String image_url = articles.getImageURL(i);
            System.out.println("////////////////////////ARTICLE " + i + "////////////////////////");
            System.out.println("title     " + title);
            System.out.println("subtitle  " + subtitle);
            System.out.println("message   " + message);
            System.out.println("image url " + image_url);

        }



        Appearance appearance = api.getAppearance("hey%20root");

        //System.out.println("JSON data: " + appearance);

        String service_tag          = appearance.getServiceTag();
        String background_image_url = appearance.getBackdropImageUrl();
        String emblem_url           = appearance.getEmblemUrl();

        System.out.println("service tag          " + service_tag);
        System.out.println("background image url " + background_image_url);
        System.out.println("emblem url           " + emblem_url);

        */
    }

}
