package homework_08;

public class Task3 {
    public static void main(String[] args) {
        /*
        Task 3
Используйте цикл while для решения задачи:
Распечатайте все числа от 1 до 100, которые делятся на 5 без остатка.

Распечатайте первые 7 чисел от 1 до 100, которые делятся на 5 без остатка.
         */
        int var = 1;
        var = 1;
        while (var <= 100) {
            if (var % 5 == 0) {
                System.out.println(var);
            }
            var++;
        }
    }
}