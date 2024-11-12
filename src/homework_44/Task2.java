package homework_44;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

/*
Task 2
Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.
 */
public class Task2 {
    public static void main(String[] args) {
        maxStr();
    }

    private static void maxStr() {
        List<String> strings = List.of("Denver","Atlanta","New York", "Washington");
        Optional<String> min = strings.stream()
                .min((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        min.ifPresent((Consumer<? super String>) System.out::println);
    }

}
