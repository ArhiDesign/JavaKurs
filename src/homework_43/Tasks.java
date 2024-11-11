package homework_43;

import java.util.List;
import java.util.stream.Collectors;



public class Tasks {
    public static void main(String[] args) {

        //numbers(); // task1
        words();     // task2
        //task3();   // task3

    }

    private static void words() {
        List<String> strings = List.of("Ananas", "Erdbeere", "Aprikose", "Ananas", "Avocado", "Gurke");

        List<String> resultWords = strings.stream()
                // список слов, начинающихся на "A"
                .filter(s -> s.startsWith("A"))
                // сортировка слов в алфавитном порядке
                .sorted()
                // удаление дубликатов
                .distinct()
                .collect(Collectors.toList());

        System.out.println(resultWords);
    }



    private static void task3() {
        List<Person> personList = getListPersons();
        // список людей старше 25 лет
        // Список людей проживающих в Берлине
        List<Person> personStream = personList.stream()
                .filter(person -> person.getAge() > 25)
                .filter(person -> person.getCity().equals("Berlin"))
                .collect(Collectors.toList());
        //personList.forEach(System.out::println);
        System.out.println(personList);

    }

    private static List<Person> getListPersons() {
        return List.of(
                new Person("Marsel", 30, "Berlin"),
                new Person("Eva", 40, "Dallas"),
                new Person("Alex", 50, "New York"),
                new Person("Svetlana", 35, "New York"),
                new Person("Ilona", 10, "New York")
        );
    }

    private static void numbers() {
        List<Integer> integers = List.of(10, 1, -95, 7, 78, 12);

        List<Integer> result = integers.stream()
                .filter(i -> i % 2 == 0 && i > 10 && i < 100)
                .collect(Collectors.toList());

        System.out.println(result);

    }
}

/*
Task 1
Напишите метод, принимающий список чисел и возвращающий новый,
 отфильтрованный список.

В новом списке должны быть только те числа из старого списка,
 которые соответствуют всем условиям: четные, больше 10 и меньше 100

Для фильтрации используйте Stream API
 */
/*
Task 2
Дан список строк.

Используя Stream API, отфильтруйте строки, которые начинаются на определенную букву (например, "A") и отсортируйте их в алфавитном порядке.

Результат сохраните в новый список строк.

Опционально + удалите дубликаты из списка строк
 */
/*
Task 3
Дан список Person с полями name, age, city. Используйте Stream API для фильтрации людей, которые старше определенного возраста и проживают в определенном городе, а затем соберите их в список.

Например, старше 25 лет и проживающих в городе "Berlin"
 */
