package factory_method.ads.generation.states;

import factory_method.ads.generation.AdGenerator;
import factory_method.ads.generation.IRegionalGenerator;
import factory_method.ads.states.MontanaAdGenerator;

public class MontanaAds extends AdGenerator
{
    @Override
    public IRegionalGenerator getGenerator()
    {
        return new MontanaAdGenerator();
    }
}
