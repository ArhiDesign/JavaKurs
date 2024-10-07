package homework_15;

public class MainTask1 {
    public static void main(String[] args) {
        Student student = new Student("Anna",  25);
        Teacher teacher = new Teacher("Müller", 50);
        Doctor doctor = new Doctor("Hans", 45);

        student.study();
        teacher.teach();
        doctor.diagnose();


    }
}

