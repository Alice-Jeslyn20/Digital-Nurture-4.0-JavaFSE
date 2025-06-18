public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get a Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Get a Rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        // Get a Square
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
