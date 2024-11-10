package homework_42;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " и " + str2 + " — анаграммы.");
        } else {
            System.out.println(str1 + " и " + str2 + " — не анаграммы.");
        }

        str1 = "triangle";
        str2 = "integral";
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " и " + str2 + " — анаграммы.");
        } else {
            System.out.println(str1 + " и " + str2 + " — не анаграммы.");
        }

        str1 = "apple";
        str2 = "papel";
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " и " + str2 + " — анаграммы.");
        } else {
            System.out.println(str1 + " и " + str2 + " — не анаграммы.");
        }

        str1 = "hello";
        str2 = "billion";
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " и " + str2 + " — анаграммы.");
        } else {
            System.out.println(str1 + " и " + str2 + " — не анаграммы.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {// являются ли две строки анаграммами
        // Если длины строк не равны, они не могут быть анаграммами
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> charCountMap1 = new HashMap<>();
        HashMap<Character, Integer> charCountMap2 = new HashMap<>();

           // Подсчитываем символы в str1
        for (char ch : str1.toCharArray()) {
            charCountMap1.put(ch, charCountMap1.getOrDefault(ch, 0) + 1);
        }

            // Подсчитываем символы в str2
        for (char ch : str2.toCharArray()) {
            charCountMap2.put(ch, charCountMap2.getOrDefault(ch, 0) + 1);
        }
        return charCountMap1.equals(charCountMap2);


    }
}



