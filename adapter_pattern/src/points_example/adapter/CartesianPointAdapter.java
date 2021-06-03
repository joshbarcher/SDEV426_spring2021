package points_example.adapter;

import points_example.points.IPoint2D;
import points_example.points.Point3D;

public class CartesianPointAdapter implements IPoint2D
{
    private Point3D adaptee;

    public CartesianPointAdapter(Point3D adaptee)
    {
        this.adaptee = adaptee;
    }

    @Override
    public double getX()
    {
        return adaptee.getX();
    }

    @Override
    public double getY()
    {
        return adaptee.getY();
    }

    @Override
    public String toString()
    {
        return "(" + adaptee.getX() + ", " + adaptee.getY() + ")";
    }
}
