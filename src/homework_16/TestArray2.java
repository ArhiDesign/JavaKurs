package homework_16;

import lesson_17.Cat17;

public class TestArray2 {
    public static void main(String[] args) {
        Cat17 cat17 = new Cat17("Test", 15, 10);

        // cat17.age = 100; Не доступно
        // Т.к. помечено protected и мы находимся в другом пакете

        // cat17.age = 1000;
    }

}
