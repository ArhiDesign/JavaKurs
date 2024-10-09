package homework_19;

import java.awt.geom.Area;

public class CalculatorApp {
    public static void main(String[] args) {
        double a = 7;
        double b = 2;

        Calculator calculator = new Calculator();
        double radius = 4.0;
        double circumFerence = calculator.calculateCircumFerence(radius);
        double area = calculator.calculateArea(radius);


        System.out.println("Сложение: " + Calculator.plus(a, b));
        System.out.println("Вычитание: " + Calculator.sub(a, b));
        System.out.println("Умножение: " + Calculator.mult(a, b));
        System.out.println("Деление: " + Calculator.div(a, b));

        System.out.println("Длинна окружности: " + circumFerence);
        System.out.println("Площадь круга: " + area);

    }
}






