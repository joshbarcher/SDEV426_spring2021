package factory_method.ads.states;

import factory_method.ads.entities.Advertisement;
import factory_method.ads.generation.IRegionalGenerator;

import java.util.List;

public class HawaiiAdGenerator implements IRegionalGenerator
{
    @Override
    public List<Advertisement> getAppropriateAds()
    {
        //use a factory method to produce a new list
        return List.of(
            new Advertisement("The beaches are amazing"),
            new Advertisement("Aloha!"),
            new Advertisement("Careful of the sharks and volcanos")
        );
    }
}
