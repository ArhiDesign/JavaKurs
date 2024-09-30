package homework_06;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        /*
        Task 2
Создайте две переменные типа int.

В первую переменную запишите случайное значение от 0 до 50.
Во вторую переменную случайное значение от 0 до 100.
(опционально) Во вторую переменную случайное значение от -20 до 30.
Проверьте:
равны ли переменные,
не равны ли они,
больше ли a, чем b,
и меньше ли b, чем a.
Выведите результат на экран.
         */

        Random random = new Random();

        int rand1 = random.nextInt(51);
        int rand2 = random.nextInt(101);
        int rand3 = random.nextInt(51) -20;

        System.out.println("Случайное значение от 0 до 50: " + rand1);
        System.out.println("Случайное значение от 0 до 100: " + rand2);
        System.out.println("Случайное значение от -20 до 30: " + rand3);

        boolean result1 = rand1 == rand2;
        System.out.println("Равны ли rand1 и rand2: " + result1);
        boolean result2 = rand1 != rand2;
        // result1 = rand1 != rand2; Это второй вариант
        System.out.println("Не равны ли rand1 и rand2: " + result2);

        boolean result3 = rand1 > rand2;
        System.out.println("Больше ли rand1, чем rand2: " + result3);
        boolean result4 = rand2 < rand1;
        System.out.println("Меньше ли rand2 чем rand1: " + result4);


    }
}
