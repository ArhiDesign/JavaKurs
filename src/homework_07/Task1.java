package homework_07;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
Task 1
Необходимо написать программу, которая предлагает пользователю ввести число на выбор: 1, 2 или 3.
Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число на выбор: 1, 2 или 3 : ");
        int randNum = scanner.nextInt();
        scanner.nextLine();

        switch (randNum) {
            case 1:
                System.out.println("Вы ввели: Один");
                break;
            case 2:
                System.out.println("Вы ввели: Два");
                break;
            case 3:
                System.out.println("Вы ввели: Три");
                break;
            default:
                System.out.println("Неверно введено число!!!");
        }

    }
}
