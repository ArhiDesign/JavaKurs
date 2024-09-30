package homework_08;

public class Task1 {
    public static void main(String[] args) {
        /*
        Task 1
Найдите произведение всех чисел от 1 до 15 включительно.
Результат выведите на экран
         */
        //Используем тип long, т.к. результат вычислений не помещает в тип данных int
        long n = 1;

        int s = 1;
        while (s <= 15) {
            n *= s;
            s++;
        }
        System.out.println("Произведение всех чисел от 1 до 15 равно: " + n);
    }
}
