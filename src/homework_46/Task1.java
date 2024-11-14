package homework_46;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/*
Task 1
Получить и вывести на экран:
текущую дату
текущий год, месяц и день
Создать дату, например Ваш день рождения и вывести на экран
Создать две даты и проверить на равенство
Получить и вывести на экран:
текущее время
текущее время + 3 часа
Создать дату:
которая на неделю позже сегодняшней
которая была на год раньше сегодняшней используя метод minus
которая на год позже сегодняшней
tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
 */
public class Task1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Текущая дата: " + date);

        LocalDate dateChristmas = LocalDate.of(2024,12,24);
        System.out.println("Christmas: " + dateChristmas);


        LocalDate date1 = LocalDate.of(2023, 11, 14);
        LocalDate date2 = LocalDate.of(2024, 11, 14);
        System.out.println("date1.equals(date2): " + date1.equals(date2));//проверка даты на равенство

        LocalTime time = LocalTime.now(); // текущее время
        System.out.println("LocalTime.now(): " + time);
        System.out.println("plusHours: " + time.plusHours(3)); // +3h


        System.out.println("plusWeeks" + date.plusWeeks(1)); // неделя позже сегодняшней даты
        System.out.println("minusYears" + date.minusYears(1)); // год назад сегодняшней даты
        LocalDate tomorrow = date.plusDays(1);
        System.out.println("tomorrow: " + tomorrow); //завтра
        System.out.println("yesterday: " + date.minusDays(1)); // вчера

    }
}
