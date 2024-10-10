package homework_21;

public class Computer {
    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(Processor processor, Memory memory, Storage storage) {
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
    }

    public void displayConfiguration() {
        System.out.println("Computer Configuration:");
        System.out.println(processor);
        System.out.println(memory);
        System.out.println(storage);

    }
}