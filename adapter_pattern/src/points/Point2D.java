package points;

public class Point2D implements IPoint2D
{
    private double x, y;

    public Point2D(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    @Override
    public String toString()
    {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
