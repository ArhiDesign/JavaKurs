package homework_22.runners;

public class AmateurRunner extends Human{
    // Блок инициализации
    {
        this.setTypeRunner("Спортсмен-любитель");
    }

    public AmateurRunner() {
        super(15, 10);
    }

    public AmateurRunner(int speed, int rest) {
        super(speed, rest);
    }


}
