package lesson_17.objetsArray;

public class PersonsApp {
    public static void main(String[] args) {

        Person garry = new Person("Garry", 31, "Photo");
        System.out.println(garry.toString());

        Person john = new Person("John", 75, "Reading, music");
        System.out.println(john.toString());

        Person[] peoples = new Person[5];
        peoples[0] = garry;
        peoples[3] = john;
        peoples[1] = new Person("Tom", 5, "crying");

        System.out.println("============\n");

        System.out.println();

    }
}
