package homework_10;

import java.util.Arrays;

/*
Написать метод, принимающий на вход массив целых чисел. Метод должен вернуть массив,
состоящий только из простых чисел, присутствующих в изначальном массиве
вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
 */
public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {0, 13, -25, 11, 31, 55, 98, 11, 5};

        int[] primeArray = getArrayWithOnlyPrime(numbers);
        System.out.println(Arrays.toString(primeArray));

    }

    public static int[] getArrayWithOnlyPrime(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                count++;


            }

        }

        int[] result = new int[count];
        for (int i = 0, idxPrime = 0; i < numbers.length && idxPrime < count; i++) {
            if (isPrime(numbers[i])) {
                result[idxPrime++] = numbers[i];
            }
        }

        return result;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;

        for (int i = 2; i < Math.sqrt(number); i++) {

            if (number % i == 0) return false;
        }
        return true;

    }
}



