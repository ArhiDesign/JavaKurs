package homework_44;

import java.util.List;
import java.util.stream.Collectors;

/*
Task 3
Имеется список целых чисел.
Необходимо отфильтровать этот список, оставив только чётные числа,
затем каждое число умножить на 2, и собрать результат в новый список
 */
public class Task3 {
    public static void main(String[] args) {

getFiltered();
    }

    private static void getFiltered() {


        List<Integer> integers = List.of(10, 1, 4, 2, 79, 15);

        List<Integer> result = integers.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * 2 )
                .collect(Collectors.toList());


        System.out.println(result);
    }
}
