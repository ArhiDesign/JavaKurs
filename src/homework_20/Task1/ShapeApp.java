package homework_20.Task1;

public class ShapeApp {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("Прямоугольник", 20, 10);
        System.out.println(rectangle.toString());
        rectangle.calculateArea();

        Circle circle = new Circle("Круг", 4.0);
        circle.displayInfo();
        circle.calculateArea();


    }


    }



