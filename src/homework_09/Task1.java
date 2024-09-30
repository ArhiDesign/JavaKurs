package homework_09;
/*
Написать метод, принимающий массив целых чисел и
распечатывающий массив в обратной последовательности.
{1, 4, 3, 6, 7}
 */
public class Task1 {
    public static void main(String[] args) {

        int[] numbers = {1, 4, 3, 6, 7};
        printArrayInReverse(numbers);


    }// Method Area

    public static void printArrayInReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }

} // End clas




