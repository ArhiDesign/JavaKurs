package homework_19;

public class CalculatorApp {
    public static void main(String[] args) {
        double a = 7;
        double b = 2;

        System.out.println("Сложение: " + Calculator.plus(a, b));
        System.out.println("Вычитание: " + Calculator.sub(a, b));
        System.out.println("Умножение: " + Calculator.mult(a, b));
        System.out.println("Деление: " + Calculator.div(a, b));
    }
}


