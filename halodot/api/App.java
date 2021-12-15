package halodot.api;

import halodot.api.HaloApi.Appearance;
import halodot.api.HaloApi.Articles;
import halodot.api.HaloApi.HaloApi;
import halodot.api.HaloApi.stats.CSRS;
import halodot.api.HaloApi.stats.Stats;

public class App 
{

    static String TOKEN ="tok_dev_sQ5pZPkjLoXc59s116bNZaeF8VmRZnH3mUCLVjNdVj9NL978WbQfa4Xm9DfxYrQf";
    static String VERSION ="0.2.0";
    public static void main( String[] args )
    {
        HaloApi api = new HaloApi(VERSION, TOKEN);
        Stats stats = api.getStats("hey root");
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
