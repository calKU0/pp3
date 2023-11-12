public class SurfaceArea {

    static void rectangle(double x, double y)
    {
        System.out.println(x * y);
    }
    
    static void circle(double radius)
    {
        final double Pi = 3.14;
        System.out.println(Pi * Pi * radius);
    }

    static void triangle(double base, double height)
    {
        System.out.println(base * height / 2);
    }
}
