package lesson_04;

public class HomeWork_04 {
    public static void main(String[] args) {
       /*
    Task 1
Неявное преобразование int в double
Напишите программу, которая:

Объявляет переменную типа int и присваивает ей значение 10.
Присваивает значение этой переменной в переменную типа double с именем myDouble.
Выводит значение myDouble на экран.
     */
     int intVal = 10;
     double myDouble = intVal;
        System.out.println("Значение myDouble: " + myDouble);
        /*
        Task 2
Явное преобразование double в int
Напишите программу, которая:

Объявляет переменную double с именем myDouble и присваивает ей значение 5.99.
Преобразует myDouble в int с помощью явного преобразования и сохраняет результат в переменную int с именем myInt.
Выводит значение myInt на экран.
         */
        double myDouble1 = 5.99;
        int myInt = (int) myDouble1;
        System.out.println("Значение myInt: " + myInt);

        /*
        Task3
        Потеря данных при преобразовании
Напишите программу, которая:

Объявляет переменную long с именем bigNumber и присваивает ей значение 15000000000 (15 миллиардов).
Преобразует bigNumber в int с помощью явного преобразования и сохраняет результат в переменную int с именем smallNumber.
Выводит значение smallNumber на экран.
Обратите внимание на полученный результат и подумайте, почему он отличается от ожидаемого.
         */
        long bigNumber = 15_000_000_000l;
        int smallNumber = (int) bigNumber;
        System.out.println("Значение: " + smallNumber);
        /*
        Task4
        Напишите программу на Java, которая преобразует ваше имя, записанное маленькими буквами, в верхний регистр.
Для каждой буквы имени создайте отдельную переменную типа char, инициализированную соответствующей буквой в нижнем регистре.
Затем преобразуйте каждую букву в верхний регистр, используя только арифметические операции (без использования библиотечных функций), и выведите результат.
Пример программы:
         */
        char ch1 = 's';
        char ch2 = 'v';
        char ch3 = 'e';
        char ch4 = 't';
        char ch5 = 'a';

        ch1 = (char) (ch1 - 32);  // ch1 = (char) (ch1 - 32);
        ch2 = (char) (ch2 - 32);  // ch2 -= 32; // ch2 = (char) ( ch2 - 32);
        ch3 = (char) (ch3 - 32);  // ch3 -= 32;
        ch4 = (char) (ch4 - 32);  // ch4 -= 32;
        ch5 = (char) (ch5 - 32);  // ch5 -= 32;

        System.out.print(ch1);
        System.out.print(ch2);
        System.out.print(ch3);
        System.out.print(ch4);
        System.out.print(ch5);
        //TODO

    }


}
