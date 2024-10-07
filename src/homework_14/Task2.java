package homework_14;

public class Task2 {
    /*
    Task 2
Сумма четных чисел
Напишите метод, который вычисляет сумму всех четных чисел в массиве.
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int result = sumNum(array);
        System.out.println("Сумма четных чисел: " + result);


    }

    public static int sumNum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;

    }
}

