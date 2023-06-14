public class Main {
    public static void main(String[] args) {
        GraphicEditor editor = new GraphicEditor();

        Shape circle = new Circle(5.0);
        editor.printShapeName(circle);

        Shape quadrilateral = new Quadrilateral(2.0, 3.0, 4.0, 5.0);
        editor.printShapeName(quadrilateral);

        Shape triangle = new Triangle(3.0, 4.0, 5.0);
        editor.printShapeName(triangle);

        Shape rectangle = new Rectangle(4.0, 6.0);
        editor.printShapeName(rectangle);
    }
}