package hommework_23.task1;

public class ShapeApp {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(4,2);
        shapes[2] = new Triangle(2, 3,4);

        double sumArea = 0;
        double sumPerimeter = 0;

        for (Shape shape : shapes) {
            sumArea += shape.area();
            sumPerimeter += shape.perimeter();
        }

        System.out.println("Общая площадь: " + sumArea);
        System.out.println("Общий периметр: " + sumPerimeter);

    }
}
