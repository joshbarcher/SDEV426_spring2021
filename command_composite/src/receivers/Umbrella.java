package receivers;

public class Umbrella
{
    private String material;
    private boolean open;
    private boolean wet;
    private String location;

    public Umbrella(String material, boolean open,
                    boolean wet, String location)
    {
        this.material = material;
        this.open = open;
        this.wet = wet;
        this.location = location;
    }

    public String getMaterial()
    {
        return material;
    }

    public void setMaterial(String material)
    {
        this.material = material;
    }

    public boolean isOpen()
    {
        return open;
    }

    public void setOpen(boolean open)
    {
        this.open = open;
    }

    public boolean isWet()
    {
        return wet;
    }

    public void setWet(boolean wet)
    {
        this.wet = wet;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    @Override
    public String toString()
    {
        return "Umbrella{" +
                "material='" + material + '\'' +
                ", open=" + open +
                ", wet=" + wet +
                ", location='" + location + '\'' +
                '}';
    }
}
