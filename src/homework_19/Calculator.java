package homework_19;

public class Calculator {


            public static double plus(double a, double b) {
                return a + b;
            }


            public static double sub(double a, double b) {
                return a - b;
            }


            public static double mult(double a, double b) {
                return a * b;
            }


            public static double div(double a, double b) {
                return a / b;
            }

            private static final double PI = 3.14159;

          //Длинна
            public double calculateCircumFerence(double radius){
                return 2 * PI * radius;
            }
           //Площадь
            public double calculateArea(double radius){
                return PI * radius * radius;
            }



        }




