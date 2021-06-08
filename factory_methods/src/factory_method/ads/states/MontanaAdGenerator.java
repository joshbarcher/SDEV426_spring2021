package factory_method.ads.states;

import factory_method.ads.entities.Advertisement;
import factory_method.ads.generation.IRegionalGenerator;

import java.util.List;

public class MontanaAdGenerator implements IRegionalGenerator
{
    @Override
    public List<Advertisement> getAppropriateAds()
    {
        //use a factory method to produce a new list
        return List.of(
            new Advertisement("Come visit yellowstone!"),
            new Advertisement("It's green everywhere!"),
            new Advertisement("Come visit glacier national park!")
        );
    }
}
