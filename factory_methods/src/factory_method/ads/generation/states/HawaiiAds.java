package factory_method.ads.generation.states;

import factory_method.ads.generation.AdGenerator;
import factory_method.ads.generation.IRegionalGenerator;
import factory_method.ads.states.HawaiiAdGenerator;
import factory_method.ads.states.TexasAdGenerator;

public class HawaiiAds extends AdGenerator
{
    //this is a factory method that we must write!
    @Override
    public IRegionalGenerator getGenerator()
    {
        return new HawaiiAdGenerator();
    }
}
