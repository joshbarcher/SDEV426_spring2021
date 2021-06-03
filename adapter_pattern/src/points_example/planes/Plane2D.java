package points_example.planes;

import points_example.points.IPoint2D;
import points_example.points.Point2D;

import java.util.ArrayList;
import java.util.List;

public class Plane2D
{
    private List<Point2D> points;

    public Plane2D()
    {
        points = new ArrayList<>();
    }

    public void addPoint(Point2D point)
    {
        points.add(point);
    }

    public void printPlane()
    {
        //pass all points_example.points to System.out.println()
        for (Point2D point : points)
        {
            System.out.println("(" + point.getX() + ", " + point.getY() + ")");
        }
    }
}
