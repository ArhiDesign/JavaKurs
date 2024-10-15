package homework_24.task1;

public class Triathlete implements Swimmer, Runner{
    @Override
    public void run() {
        System.out.println("Triathlete runs");
    }

    @Override
    public void swim() {
        System.out.println("Triathlete swims");

    }
}
