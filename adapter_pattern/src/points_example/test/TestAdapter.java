package points_example.test;

import points_example.adapter.CartesianPointAdapter;
import points_example.planes.CartesianPlane;
import points_example.points.Point2D;
import points_example.points.Point3D;

public class TestAdapter
{
    public static void main(String[] args)
    {
        CartesianPlane plane = new CartesianPlane();

        //verify that I can only add 2D points_example.points
        plane.add(new Point2D(2, 5));
        plane.add(new Point2D(1, -2));
        plane.add(new Point2D(0, 0));
        plane.add(new CartesianPointAdapter(new Point3D(1, -10, 0)));
        plane.add(new CartesianPointAdapter(new Point3D(2, 15, 3)));

        plane.print();
    }
}
