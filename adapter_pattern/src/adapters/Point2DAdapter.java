package adapters;

import points.IPoint2D;
import points.Point3D;

//the "adapter" class
public class Point2DAdapter implements IPoint2D
{
    //store the adaptee
    private Point3D point;

    public Point2DAdapter(Point3D point)
    {
        this.point = point;
    }

    @Override
    public double getX()
    {
        return point.getX();
    }

    @Override
    public double getY()
    {
        return point.getY();
    }
}
