package lesson_04;

public class TypeCharExample {
    public static void main(String[] args) {

        char a = 'A'; // Переменная будет хранить букву А латинского алфавита
        char a1 = 65; // Переменная будет хранить букву А латинского алфавита, соотв коду 65 в десятичной системе счислений
        char a2 = 0x41; // Присваиваем число в 16-формате. Что соответсвует все той же букве A
        a2 = 0x0041; // полная форма записи числа в 16 системе счислений
        char a3 = '\u0041'; // Еще олин способ задать значение в 16 формате
        char x = '\u1507';

        System.out.println("a: " + a);
        System.out.println("a1: " + a1);
        System.out.println( "a2: " + a2);
        System.out.println(" a3: " + a3);
        System.out.println("x: " + x);

        char digit0 = 48;
        System.out.println("digit0:" + digit0);
         /*
        1. digit0 -> int
        2. сложение двух int -> int
        3. кастирование результата из типа int к типу char
         */
        digit0 = (char) (digit0 + 5);

        digit0 += 5; // digit0 = (char) (digit0 + 5);
        System.out.println("digit0: " + digit0);

        char letter = 97; // a
        System.out.println("letter: " + letter);
        letter++;
        System.out.println("letter: " + letter);

        System.out.println("int из char даст 10-й код символа: " + (int) letter);
        System.out.println(0 + letter);

        // 0...9 -> соответствуют кодам 48...57
        // a...z -> соответствуют кодам 97...122
        // A...Z -> соответствуют кодам 65...90


        char x1 = 12853;
        System.out.println(x1);

        int var = 5;
        var += 5; // var = var + 5;
        System.out.println("var:" + var);






    }

}
