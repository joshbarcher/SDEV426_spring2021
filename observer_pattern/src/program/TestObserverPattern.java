package program;

import observables.Mountain;
import observers.BirdWatcher;
import observers.Hiker;

public class TestObserverPattern
{
    public static void main(String[] args)
    {
        Mountain mount = new Mountain("Mount Saint Helen");
        mount.addObserver(new Hiker("Josh"));
        mount.addObserver(new Hiker("Tyler"));
        mount.addObserver(new BirdWatcher("David"));

        mount.avalanche();
        mount.sunset();
        mount.birdsNesting();
    }
}
