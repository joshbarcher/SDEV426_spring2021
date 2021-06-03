package points_example.planes;

import points_example.points.IPoint2D;

import java.util.ArrayList;
import java.util.List;

public class Plane2D
{
    private List<IPoint2D> points;

    public Plane2D()
    {
        points = new ArrayList<>();
    }

    public void addPoint(IPoint2D point)
    {
        points.add(point);
    }

    public void printPlane()
    {
        //pass all points_example.points to System.out.println()
        for (IPoint2D point : points)
        {
            System.out.println("(" + point.getX() + ", " + point.getY() + ")");
        }
    }
}
