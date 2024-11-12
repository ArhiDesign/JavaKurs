package homework_44;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        num();
    }

    private static void num() {
        List<Integer> numbers = List.of(5, 22, 33, 1, 59, 28, 77, 96, 2);

        List<Integer> result = numbers.stream()
                .filter(i -> i > 10)
                .sorted((i1, i2) -> (i1 % 10) - (i2 % 10))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
/*
Task 1
Из списка целых чисел выделите те значения, которые больше 10;
 отсортируйте эти значения по значению последней цифры в числе и выведите результат на экране
 */