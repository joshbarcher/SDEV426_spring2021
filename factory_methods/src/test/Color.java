package test;

public class Color
{
    //components will be in the range [0,255]
    private int red;
    private int green;
    private int blue;

    //this will always lie between [0, 1]
    //where 0 means transparent and 1 opaque
    private double alpha;

    private Color(int red, int green, int blue,
                 double alpha)
    {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
    }

    //static factory methods...
    public static Color grayscale(int shade)
    {
        if (shade < 0 || shade > 255)
        {
            throw new RuntimeException("Bad color component given");
        }
        return new Color(shade, shade, shade, 1.0);
    }

    public double getRed()
    {
        return red;
    }

    public double getGreen()
    {
        return green;
    }

    public double getBlue()
    {
        return blue;
    }

    public double getAlpha()
    {
        return alpha;
    }

    @Override
    public String toString()
    {
        return "(" + red + "," + green + "," + blue + "," +
                ((int) ((alpha / 1.0) * 100)) + "%)";
    }
}
