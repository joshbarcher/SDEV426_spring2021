package program;

import observables.Mountain;
import observables.Wildlife;
import observers.BirdWatcher;
import observers.Hiker;

public class TestObserverPattern
{
    public static void main(String[] args)
    {
        //create an observable
        Mountain mount = new Mountain("Mount Saint Helen");
        Wildlife bear = new Wildlife("animal", "black bear");
        Wildlife fish = new Wildlife("fish", "salmon");

        //create several observers
        Hiker hiker1 = new Hiker("Josh");
        Hiker hiker2 = new Hiker("Tyler");
        BirdWatcher watcher = new BirdWatcher("David");

        //attach them to the observable
        mount.addObserver(hiker1);
        mount.addObserver(hiker2);
        mount.addObserver(watcher);
        bear.addObserver(hiker1);
        fish.addObserver(watcher);

        //do something
        mount.avalanche();
        mount.sunset();
        mount.birdsNesting();
        bear.doSomething("The bear scratches itself");
        fish.doSomething("The fish swam");
    }
}
