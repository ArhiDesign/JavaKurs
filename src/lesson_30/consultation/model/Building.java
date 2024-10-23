package lesson_30.consultation.model;

public class Building {

    // поля класса
    //этажность, число
    private int floor;
    //материал, строка
    private String material;
    //номер на здании, число
    private int number;
    //цвет, строка
    private String color;

    // constructor
    public Building(int floor, String material, int number, String color) {
        this.floor = floor;
        this.material = material;
        this.number = number;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getFloor() {
        return floor;
    }

    public String getMaterial() {
        return material;
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Building{" +
                "floor=" + floor +
                ", material='" + material + '\'' +
                ", number=" + number +
                ", color='" + color + '\'' +
                '}';
    }
}
