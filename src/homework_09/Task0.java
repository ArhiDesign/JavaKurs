package homework_09;
/* Task 0
        Написать метод, принимающий на вход строку. Метод должен вывести на экран
        число,
        соответсвующее количеству символов в строке.
        Например: Если в метод пришла строка "hello" -
            метод должен вывести число 5 (так как в строке hello 5 символов)
         */
public class Task0 {
    public static void main(String[] args) {

        String input = "Hello";

        printStringLength(input);

    } // Method area

    public static void printStringLength(String str) {
        int length = str.length();

        System.out.println("Количеству символов в строке: " + length);

    }


    }//End class









