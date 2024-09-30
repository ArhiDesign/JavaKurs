package homework_10;
/*
Task 2
Написать метод, принимающий на вход массив строк. Метод должен вернуть массив,
 состоящий из самой короткой и самой длинной строки изначального массива.
 */
public class Task2 {
    public static void main(String[] args) {

        String[] input = {"Hallo", "Java", "ist", "beste", "Program"};
        String[] result = findKurzLong(input);

        System.out.println("Самая короткая строка: " + result[0]);
        System.out.println("Самая длинная строка: " + result[1]);


    }



    public static String[] findKurzLong(String[] strings) {

        if (strings == null || strings.length == 0) {
            return new String[] {"", ""};
        }

        String kurz = strings[0];
        String lang = strings[0];

        for (String str : strings) {
            if (str.length() < kurz.length()) {
                kurz = str;
            }
            if (str.length() > lang.length()) {
                lang = str;
            }
        }

        return new String[] {kurz, lang};

    }
}
