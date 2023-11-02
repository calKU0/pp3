public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        rec1.parameterX = 3.5f;
        rec1.parameterY = 6;
        rec1.showDimentions();
        rec1.showPerimeter();
        rec1.showSurfaceArea();

        Rectangle rec2 = new Rectangle();
        rec2.parameterX = 5;
        rec2.parameterY = 8.5f;
        rec2.showDimentions();
        rec2.showPerimeter();
        rec2.showSurfaceArea();
    }
}
