package homework_06;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        Task 3
Попросите пользователя ввести целое число с клавиатуры.
Ваша программа должна вывести строку в формате:
Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
Copy
Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        boolean isEven = (num % 2 == 0);
        boolean isEven2 = (num % 3 == 0);
        boolean isEven3 = isEven && isEven2;

        String result = String.format("Число: %d четное: %b; кратно 3: %b; четное и кратное 3: %b",
                num, isEven, isEven2, isEven3);

        System.out.println(result);


    }
}
