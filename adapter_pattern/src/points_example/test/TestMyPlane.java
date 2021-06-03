package points_example.test;

import points_example.adapters.Point2DAdapter;
import points_example.planes.Plane2D;
import points_example.points.Point2D;
import points_example.points.Point3D;

public class TestMyPlane
{
    public static void main(String[] args)
    {
        Plane2D cartesian = new Plane2D();

        cartesian.addPoint(new Point2D(2, 3.71));
        cartesian.addPoint(new Point2D(0, 0));
        cartesian.addPoint(new Point2D(-1.4, 2.88));
        cartesian.addPoint(new Point2D(9, 1));
        cartesian.addPoint(new Point2DAdapter(new Point3D(1.1, 4.7, -2)));

        cartesian.printPlane();
    }
}
