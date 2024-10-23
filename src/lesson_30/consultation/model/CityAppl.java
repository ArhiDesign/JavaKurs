package lesson_30.consultation.model;

public class CityAppl {

    public static void main(String[] args) {

        Building b1 = new Building(3, "wood", 13, "yellow");

        System.out.println(b1);
        b1.setColor("grey");
        System.out.println(b1);
        b1.setFloor(5);
        System.out.println(b1);
        b1.setFloor(17);

        //================
        int f = b1.getFloor();
        System.out.println(f);


    }

}
