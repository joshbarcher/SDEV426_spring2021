package factory_method.ads.generation;

import factory_method.ads.entities.Advertisement;

import java.util.List;

public interface IRegionalGenerator
{
    public List<Advertisement> getAppropriateAds();
}


