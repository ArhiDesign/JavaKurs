package lesson_08;

public class WhilleLoop {
    public static void main(String[] args) {
        /*
        while ( условия ) {
        тело цикла
        код который будет повторяться
        }
         */

        // Вывести на экран числа от 1 до 5
        int number = 1; //инициализация переменной

        while (number <= 5) { //Условие (приедикат) цикла
            System.out.println(number); // Действие: вывод числа
            number++; // number = number + 1
        }
        System.out.println("Цикл закончен. Продолжаем выполнение программы");

        //Бесконечный цикл:
      //  int y = 5;
        // while (y < 10) {
           // System.out.println("y");
        // }


        // Распечатать числа от 100 до 90 включительно в порядке убывания

        int i = 100;
        while (i >= 90 ) {
            System.out.println(i);
            i--; // i = 1 - 1;
        }
        System.out.println("Цикл закончен. Продолжаем выполнение программы");

        //Задача Найти сумму чисел от 1 до 100
        /*
        1. Перебрать числа от 1 до 100.
        2. Каждое число добавить в какую-то переменную, накапливающую сумму чисел
         */

        int n = 1; // Инициализация счетчика цикла
        //i = 1;
        int sum = 0;
        while (n <= 100){
            sum += n; // Добавляем текущее значение n к сумме
            n++;
        }
        System.out.println("Сумма чисел от 1 до 100: " + sum);

        System.out.println(" =================== \n");

        // Задача Вывести на экран все четные числа в диапазоне от 1 до 21
        /*
        Запустить перебор чисел от 1 до 21
        Проверить является ли число четным
            Если четное - распечатать
            Иначе - никаких действий не требуется
        Увеличить счетчик цикла
         */

        i = 1;
        while (i <= 21) {
            // проверка числа на четность
            if (i % 2 == 0) { // число четное
                System.out.println(i);
            }
            i++;
        }

        // Распечатать каждый символ строки в отдельной строчке
        String str = "Hello!";

        // Нам нужно перебрать все индексы. От 0 до len - 1.
        // На каждой итерации берем символ по индексу. Распечатывает.
        // Повторить с другим индексом

        i = 0; // 0,1,2... len-1
        while (i <= str.length() - 1) {
            char ch = str.charAt(i);
            System.out.println(ch);
            i++;
        }

        System.out.println(" === Opt2 ===== \n");
        i = 0; // 0,1,2... len-1
        while (i <= str.length() - 1) {
            System.out.println(str.charAt(i++));
        }


    }
}
