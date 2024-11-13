package homework_45;

public class PasswordValidator {

    public static void isPasswordValid (String password) throws PasswordValidateException{
        if (password == null || password.length() < 8) {
            System.out.println("Password should be at least 8 characters");
            throw new PasswordValidateException("Password should be at least 8 characters");
        }

        boolean isDigit = false;
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isSpecialSymbol = false;

        // альтернативный способ объявление переменных
        boolean[] result = new boolean[4]; // false, false, false, false

       // Допустимые символы
        String symbols = "!%$@&*()[].,-";

        // Перебираю символы
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) isDigit = true; // res[0] = true
            if (Character.isUpperCase(ch)) isUpperCase = true; // res[1] = true
            if (Character.isLowerCase(ch)) isLowerCase = true; //  res[2] = true
            if (symbols.indexOf(ch) >= 0) isSpecialSymbol = true;
            // if (symbols.contains(String.valueOf(ch))) isSpecialSymbol = true;

        }
        if (!isDigit) {
            throw new PasswordValidateException("Password must contain at least one digit");
        }
        if (!isUpperCase) {
            throw new PasswordValidateException("Password must contain at least one uppercase letter");
        }
        if (!isLowerCase) {
            throw new PasswordValidateException("Password must contain at least one lowercase letter");
        }
        if (!isSpecialSymbol) {
            throw new PasswordValidateException("Password must contain at least one special character");
        }

        // Если все проверки прошли успешно
        System.out.println("Password is valid");

       // System.out.printf("%s | %s | %s | %s\n", isDigit, isUpperCase, isLowerCase, isSpecialSymbol);

        // Если хотя бы в одной переменной останется значение false, то весь пароль НЕ будет признан валидным = (признан не валидным)
        //return isDigit && isUpperCase && isLowerCase && isSpecialSymbol;

    }
}
