package homework_46;
/*
Task 2
Написать метод, принимающий список из нескольких дат типа LocalDate
и возвращающий количество дней между самой ранней и поздней датами в этом списке.
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<LocalDate> dates = List.of(
                LocalDate.of(2024, 10, 15),
                LocalDate.of(2024, 1, 15),
                LocalDate.of(2024, 6, 15),
                LocalDate.of(2024, 5, 15)
        );
           task2(dates);
    }
    public static void task2(List<LocalDate> dates) {
        // Если список пустой или null, возвращаем 0
        if (dates == null || dates.isEmpty()) {
           System.out.println("Список дат пустой");
            return;
        }
        LocalDate min = dates.get(0);
        LocalDate max = dates.get(0);

            for (LocalDate date : dates) {
            //  если текущая дата раньше...
            if (date.isBefore(min)) {
                min = date;
            }
            //  если текущая дата позже...
            if (date.isAfter(max)) {
                max = date;
            }
        }
        long daysBetween = ChronoUnit.DAYS.between(min, max);
        System.out.println("Количество дней между самой ранней (" + min + ") и самой поздней датой (" + max + "): " + daysBetween);
    }
}
