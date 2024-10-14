package homework_22.runners;

public class ProfiRunner extends Human{
    // Блок инициализации
    {
        setTypeRunner("Спортсмен-профи");
    }


    public ProfiRunner() {
        super(25, 5);
    }

    public ProfiRunner(int runSpeed, int restTime) {
        super(runSpeed, restTime);
    }

}
