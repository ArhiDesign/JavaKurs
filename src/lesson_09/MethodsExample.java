package lesson_09;

import java.net.Socket;

public class MethodsExample {
    public static void main(String[] args) {

       sayHello();
       sayHello();

       //String string = "Java";
        saySommething("Java");

        char ch = 'A';
        char anotherChar = 'B';


        printDecimalCodeChar(ch);
        printDecimalCodeChar(anotherChar);
        printDecimalCodeChar('J');

        // System.out.println("Hello");

        System.out.println("====== PrintArray ========");

        int[] array = {1, 45 ,76, 54, 90, 435, 0, 45};

        printArray(array);
        int[] array2 = {1,2,5};
         printArray(array2);
         array[0]= -100000;
         //
        // Задача



    } //Method area

    public static void printNumbers(int n){
        
    }

    public static void printArray(int[] array) {
        System.out.println("[");
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i] + ((i < array.length - 1) ? ", " : "]\n"));
            i++;
        }
    }


    public static void printDecimalCodeChar(char ch1) {
        System.out.println((int) ch1);
    }

    public static void saySommething(String text){
        System.out.println(text);
    }

    public static void sayHello(){
        System.out.println("Hello");

    }



}// End class
