package homework_09;
/*
Task 2
Написать метод, принимающий на вход целое число.
 Метод должен вывести на экран 2 в степени это Число
Например: Если в метод пришло число 3 -
метод должен вывести число 8 (так как 2 в степени 3 = 8)
класс Math для нахождения степени числа использовать нельзя ;)
 */
public class Task2 {
    public static void main(String[] args) {
        int num = 3; // Пример входного числа
        output(num);
        
    }

    public static void output(int num) {
        int result = 1; // Начальное значение для 2^0

        // Умножаем 2 само на себя 'число' раз
        for (int i = 0; i < num; i++) {
            result *= 2;
        }

        System.out.println(result); // Выводим результат


    }


}
