package factory_method.ads.program;

import factory_method.ads.entities.Advertisement;
import factory_method.ads.generation.AdGenerator;
import factory_method.ads.generation.states.HawaiiAds;
import factory_method.ads.generation.states.MontanaAds;
import factory_method.ads.generation.states.TexasAds;

public class AdsTest
{
    public static void main(String[] args)
    {
        AdGenerator adgenerator = new TexasAds();
        adgenerator = new HawaiiAds();
        adgenerator = new MontanaAds();

        for (Advertisement ad : adgenerator.getAllAds())
        {
            System.out.println(ad);
        }
    }
}



