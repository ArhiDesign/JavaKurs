package homework_41;

import java.util.HashMap;
import java.util.Map;

/*
Task 1
Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает Map<String, Integer>,
 где каждому слову соответствует количество его вхождений в текст.
 */
public class Task1 {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);

        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    // Метод для подсчета частоты вхождений слов
    private static Map<String, Integer> frequencyDictionary(String text) {
        Map<String, Integer> result = new HashMap<>();


        String[] words = text.split("[\\s,.!?\n]+");

        // Проходим по каждому слову и считаем его вхождения
        for (String word : words) {

            word = word.trim().toLowerCase();

            if (word.isEmpty()) continue;


            Integer count = result.get(word);

            if (count == null) {
                count = 0;
            }


            result.put(word, count + 1);
        }

        return result;
    }
    }
