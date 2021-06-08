package factory_method.ads.states;

import factory_method.ads.entities.Advertisement;
import factory_method.ads.generation.IRegionalGenerator;

import java.util.List;

public class TexasAdGenerator implements IRegionalGenerator
{
    @Override
    public List<Advertisement> getAppropriateAds()
    {
        //use a factory method to produce a new list
        return List.of(
            new Advertisement("Visit the Alamo!"),
            new Advertisement("Everything is big, including our cities!"),
            new Advertisement("Best place to BBQ!")
        );
    }
}
