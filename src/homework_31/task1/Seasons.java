package homework_31.task1;
/*
Task 1
Реализуйте Enum для определения четырех времен года с методами,
 возвращающими среднюю температуру для каждого времени года.
 */
public enum Seasons {
    WINTER("Зима", 4),
    SPRING("Весна",18),
    SUMMER("Лето", 26),
    AUTUMN("Осень",14);

    private  String season;
    private int averageTemperature;

    Seasons(String season, int temp) {
        this.season = season;
        this.averageTemperature = temp;
    }

    public String getSeason() {
        return season;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    @Override
    public String toString() {
        return season + " - Средняя температура: " + averageTemperature + "°C";
    }
}
