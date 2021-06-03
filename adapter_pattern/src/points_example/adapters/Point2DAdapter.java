package points_example.adapters;

import points_example.points.IPoint2D;
import points_example.points.Point3D;

//the "points_example.adapter" class
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
