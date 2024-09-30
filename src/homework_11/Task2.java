package homework_11;
/*
Написать метод, который находит среднее значение элементов в массиве (среднее арифметическое).
 */
public class Task2 {
    public static void main(String[] args) {
        // В методе `main` создается массив
        int[] numbers = {2, 1, 3, 1, 4};
        double average = AverageVal(numbers);// Метод AverageVal вызывается для его обработки
        System.out.println("Среднее значение: " + average); //после чего результат выводится на экран


    }// Method area

    public static double AverageVal(int[] array){
        if (array.length == 0) {
            return 0;// Возвращаем 0 или можно бросить исключение, если массив пуст
        }
        double sum = 0;
        //После вычисления суммы мы делим ее на количество элементов в массиве (`array.length`)
        // для получения среднего арифметического
        for (int number : array) {
            sum += number;

        }
        return sum / array.length;

    }


}//End class
