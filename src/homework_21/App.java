package homework_21;

public class App {
    public static void main(String[] args) {
        Processor processor = new Processor("I","I10");
        Memory memory = new Memory("X", "X10");
        Storage storage = new Storage("Y", "Y10");

        Computer computer = new Computer(processor, memory, storage);
        computer.displayConfiguration();
    }
}
