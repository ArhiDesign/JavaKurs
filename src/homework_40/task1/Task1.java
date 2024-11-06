package homework_40.task1;

import java.util.*;

/*
Напишите метод, принимающий строку и возвращающий Список ее слов без повторений, отсортированный в порядке увеличения длин слов.
Если строки имеют одинаковую длину - сортировать в естественном порядке

public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }

// Output:
[для, слов, строка, которые, Тестовая, удаления, повторяются]
 */
public class Task1 {
    public static void main(String[] args) {

        test();


    }

public static void test(){
    String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
    // Заменяем все не буквы на пустоту
    String newString = testString.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");
    System.out.println(newString);

    // Преобразование строки в массив слов
    String[] words = newString.split(" ");
    System.out.println("Массив слов:" + Arrays.toString(words));

    // Arrays.asList(T[] array) -> преобразует массив в коллекцию
    List<String> list = Arrays.asList(words);
    System.out.println("Список слов" + list);

    //Убираем повторяющиеся слова
    Set<String> uniqueWordsSet = new HashSet<>(list);
    System.out.println("Уникальные слова:" + uniqueWordsSet);

    List<String> uniqueWordsList = new ArrayList<>(uniqueWordsSet);

    // Сортировка списка по длине слов, если длина одинаковая - по естественному порядку
    uniqueWordsList.sort((word1, word2) -> {
        int lengthComparison = Integer.compare(word1.length(), word2.length());
        if (lengthComparison == 0) {
            return word1.compareTo(word2);
        }
        return lengthComparison;
    });

    System.out.println("Сортировка уникальных слов: " + uniqueWordsList);

}

}
