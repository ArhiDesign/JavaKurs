package homework_20.Task1;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
        }

    public void calculateArea() {
        double area = width * height;
        System.out.println("Площадь прямоугольника: " + area);


    }

}

