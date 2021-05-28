package observers;

public class BirdWatcher implements IObserver
{
    private String name;

    public BirdWatcher(String name)
    {
        this.name = name;
    }

    @Override
    public void update(Object... data)
    {
        System.out.println("Bird watcher received data (" + name + ")");
        if (data[1].toString().contains("bird"))
        {
            System.out.println("Better check this out: " + data[1]);
        }
    }
}
