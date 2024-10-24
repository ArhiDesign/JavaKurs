package homework_31.task1;

public class SeasonApp {
    public static void main(String[] args) {

        for (Seasons seasons : Seasons.values()) {
            System.out.println(seasons);
            System.out.println(seasons.getSeason());
            System.out.println(seasons.getAverageTemperature());
            System.out.println("============\n");
        }
    }
}