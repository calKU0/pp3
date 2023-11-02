public class Rectangle {
    float parameterX;
    float parameterY;

    public void showDimentions()
    {
        System.out.println("Dimentions: "  + parameterX + "x" + parameterY);
    }

    public void showSurfaceArea()
    {
        float surfaceArea = parameterX + parameterY;
        System.out.println("Surface Area: " + surfaceArea); 
    }

    public void showPerimeter()
    {
        float perimeter = 2 * (parameterX + parameterY);
        System.out.println("Perimeter: " + perimeter); 
    }
}
