package homework_19;

public class ImmutablePointMain {
    public static void main(String[] args) {
        ImmutablePoint point = new ImmutablePoint(3, 4);
        System.out.println("Point coordinates: (" + point.getX() + ", " + point.getY() + ")");
    }
}
