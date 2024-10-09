package homework_20.Task1;

public class Circle extends Shape{
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Площадь круга: " + area);

    }



}
