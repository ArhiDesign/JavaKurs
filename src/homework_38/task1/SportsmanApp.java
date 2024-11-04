package homework_38.task1;

import java.util.Arrays;
import java.util.Comparator;

public class SportsmanApp {
    public static void main(String[] args) {
       Sportsman[] sportsman = new Sportsman[3];
       sportsman[0] = new Sportsman("Piter",50,75);
       sportsman[1] = new Sportsman("Alex",49,87);
       sportsman[2] = new Sportsman("Leon",49,89);

        System.out.println(Arrays.toString(sportsman));

        System.out.println("\n=========По имени==================");

        Arrays.sort(sportsman);

        System.out.println(Arrays.toString(sportsman));

        System.out.println("\n=========По высшему рейтингу==================");
        SportsmanScoreComparator sportsmanScoreComparator = new SportsmanScoreComparator();

        Arrays.sort(sportsman, sportsmanScoreComparator);
        System.out.println(Arrays.toString(sportsman));

        System.out.println("\n =========== Анонимный класс для сортировки age ========= \n");

        Arrays.sort(sportsman, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman sportsman1, Sportsman sportsman2) {
                return sportsman1.getAge();
            }
        });
        System.out.println(Arrays.toString(sportsman));
    }
}
