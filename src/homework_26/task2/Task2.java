package homework_26.task2;

import lists.MyArrayList;

/*
Task 2. * Опционально
Обобщенный статический метод “Печать двух списков”
Напишите обобщенный статический метод printTwoLists, который принимает
 два параметра типа MyArrayList и MyArrayList, и выводит элементы обоих списков.


Требования:

Метод должен быть обобщенным по двум типам T и U.
Элементы списков могут быть разных типов.
 */
public class Task2 {
    public static void main(String[] args) {
        MyArrayList<String> names = new MyArrayList<>();
        names.add("Alice");
        names.add("Bob");

        MyArrayList<Integer> scores = new MyArrayList<>();
        scores.add(85);
        scores.add(92);

        MyArrayList<String> strings = new MyArrayList<>();
        strings.add("Java");
        strings.add("Python");

        printTwoLists(names, scores);
        System.out.println();

        printTwoLists(names, strings);
    }



    public static <T, U> void printTwoLists(MyArrayList<T> list1, MyArrayList<U> list2){
        // Вывожу элементы первого списка
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        // Вывод второго списка
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

    }
}
