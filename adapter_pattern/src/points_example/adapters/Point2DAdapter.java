package points_example.adapters;

import points_example.points.IPoint2D;
import points_example.points.Point2D;
import points_example.points.Point3D;

//the "points_example.adapter" class
public class Point2DAdapter extends Point2D
{
    public Point2DAdapter(Point3D point)
    {
        super(point.getX(), point.getY());
    }
}
