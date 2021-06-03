package points_example.planes;

import points_example.points.IPoint2D;

import java.util.ArrayList;
import java.util.List;

public class CartesianPlane
{
    private List<IPoint2D> points;

    public CartesianPlane()
    {
        points = new ArrayList<>();
    }

    public void add(IPoint2D point)
    {
        points.add(point);
    }

    public void print()
    {
        points.stream().forEach(System.out::println);
    }
}
