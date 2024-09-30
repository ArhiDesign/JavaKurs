package homework_11;
/*
Написать метод, который считает сумму всех элементов в массиве.
 */
public class Task1 {
    public static void main(String[] args) {

        int result = allNumbers(25, 10, 25); // Вызов метода и сохранение возвращаемого значения
        System.out.println("Сумма: " + result);
    }

    public static int allNumbers(int num1, int num2, int num3) {

        int sum = num1 + num2 + num3;
        return sum; // Возврат значения
    }
}
