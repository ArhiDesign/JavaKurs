package homework_15;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Anna", 25);
        Teacher teacher = new Teacher("Müller", 50);
        Doctor doctor = new Doctor("Hans", 45);

        student.displayInfo();
        student.study();

        System.out.println();

        teacher.displayInfo();
        teacher.teach();

        System.out.println();

        doctor.displayInfo();
        doctor.diagnose();
    }
}

