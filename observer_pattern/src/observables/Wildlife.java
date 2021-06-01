package observables;

public class Wildlife extends Observable
{
    private String type;
    private String name;

    public Wildlife(String type, String name)
    {
        this.type = type;
        this.name = name;
    }

    public void doSomething(String event)
    {
        notifyObservers(this, event);
    }

    public String getType()
    {
        return type;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "Wildlife{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
