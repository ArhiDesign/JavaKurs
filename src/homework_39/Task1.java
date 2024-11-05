package homework_39;
/*
Напишите метод, который принимает на вход две реализации интерфейса List.

Метод должен возвращать список состоящий из элементов,
 которые присутствуют в обеих коллекциях.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        Collection<Integer> colA = new ArrayList<>();
        Collection<Integer> colB = new ArrayList<>();
        colA.addAll(List.of(0, 2, 50, 10, 7, 20));
        colB.addAll(List.of(50, 30, 10));
        System.out.println("colA: " + colA);
        System.out.println("colB: " + colB);
        colA.retainAll(colB);
        System.out.println("colA.retainAll(colB): " + colA);
    }
}
