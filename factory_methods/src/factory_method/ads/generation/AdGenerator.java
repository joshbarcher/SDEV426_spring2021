package factory_method.ads.generation;

import factory_method.ads.entities.Advertisement;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class AdGenerator
{
    private Random random = new Random();
    private List<Advertisement> ads;
    
    public AdGenerator()
    {
        /* ... */
    }

    //THIS IS A FACTORY METHOD!
    public abstract IRegionalGenerator getGenerator();
    
    public Advertisement showAd()
    {
        //get our regional ads if not loaded
        if (ads == null)
        {
            IRegionalGenerator generator = getGenerator();
            ads = generator.getAppropriateAds();
        }
        
        //pick a random advertisement to show
        return ads.get(random.nextInt(ads.size()));
    }
    
    public List<Advertisement> getAllAds()
    {
        //get our regional ads if not loaded
        if (ads == null)
        {
            IRegionalGenerator generator = getGenerator();
            ads = generator.getAppropriateAds();
        }
        
        return Collections.unmodifiableList(ads);
    }
}

