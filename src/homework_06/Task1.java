package homework_06;

public class Task1 {
    public static void main(String[] args) {
        /*
        Task 1
Дан текст Programming is fun.
Напишите программу, которая проверяет, содержит ли эта строка слово “fun”,
и выведите результат в виде булевой переменной.
         */
        String string = "Programming is fun";
        boolean aFun = string.contains("fun");
        System.out.println(aFun);

    }
}
