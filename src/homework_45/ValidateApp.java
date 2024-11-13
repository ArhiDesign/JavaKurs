package homework_45;

public class ValidateApp {
    public static void main(String[] args) {

        String password = "testPassword!100";

        try {
            PasswordValidator.isPasswordValid(password);
            System.out.println("Password прошел проверку");
        } catch (PasswordValidateException e) {
            System.out.println("Password is not valid");
            String message1 = e.getMessage();
            System.out.println(message1);
        }



    }
}
