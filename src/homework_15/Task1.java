package homework_15;
/*
Task 1
Посмотрите вокруг себя.
Напишите три класса, описывающие какие-то сущности вокруг Вас.
Не забудьте использовать абстракцию.
Например, опишите студента, преподавателя и, допустим, врача.
Вы можете выбрать свои сущности для описания.
 */
public class Task1 {

    // Класс Студент
    class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void study() {
            System.out.println(name + " is studying ");
        }

        public void displayInfo() {
            System.out.println("Student Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    // Класс Преподаватель
    class Teacher {
        private String name;
        private int age;

        public Teacher(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void teach() {
            System.out.println(name + " is teaching ");
        }

        public void displayInfo() {
            System.out.println("Teacher Name: " + name);
            System.out.println("Age: " + age);
        }
    }
    // Класс Врач
    class Doctor {
        private String name;
        private int age;

        public Doctor(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public void diagnose() {
            System.out.println(name + " is diagnosing a patient.");
        }
        public void displayInfo() {
            System.out.println("Doctor Name: " + name);
            System.out.println("Age: " + age);
        }
    }


}
