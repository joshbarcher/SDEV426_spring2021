package observers;

import observables.Mountain;

public class Hiker implements IObserver
{
    private String name;

    public Hiker(String name)
    {
        this.name = name;
    }

    @Override
    public void update(Object... data)
    {
        System.out.println("Hiker received data (" + name + ")");
        if (data[0] instanceof Mountain)
        {
            System.out.println("Received a message from: " + ((Mountain)data[0]).getName());
        }
        System.out.println(data[1]);
    }
}
