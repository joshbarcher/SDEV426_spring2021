package observables;

import observers.Hiker;

public class Mountain extends Observable
{
    private String name;

    public Mountain(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void avalanche()
    {
        notifyObservers(this, "There was an avalanche");
    }

    public void sunset()
    {
        notifyObservers(this, "It's sunset over the mountain");
    }

    public void birdsNesting()
    {
        notifyObservers(this, "A Bald Eagle bird is nesting in the northern ridge");
    }
}
