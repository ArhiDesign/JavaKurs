package homework_23.task1;

public class Triangle extends Shape{
    private double a, b, c;

    public Triangle(double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double area() {
        double sum = perimeter() / 2;
        return Math.sqrt(sum * (sum - a) * (sum -b) * (sum - c));
    }

    @Override
    double perimeter() {
        return a + b + c;
    }
}
