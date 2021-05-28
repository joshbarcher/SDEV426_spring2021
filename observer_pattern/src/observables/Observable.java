package observables;

import observers.IObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable
{
    //these are objects interesting in seeing this class "change"
    private List<IObserver> observers;

    public Observable()
    {
        observers = new ArrayList<>();
    }

    //add observer objects...
    public void addObserver(IObserver observer)
    {
        if (!observers.contains(observer))
        {
            observers.add(observer);
        }
    }

    //let observer objects know that something "changed"
    public void notifyObservers(Object... data)
    {
        for (IObserver observer : observers)
        {
            observer.update(data);
        }
    }
}
