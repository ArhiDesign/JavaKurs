package homework_30;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PersonTest {
    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q$";

    @BeforeEach
    void setUp(){
        person = new Person(startEmail, startPassword);
    }
    /*
    1. Берем валидный email
    2. Устанавливает сеттером валидный email person-у
    3. Мы ожидаем: что у person в поле email будет валидный email, который мы установили на шаге 2
    4. Проверить равенство person.getEmail() c валидным email, который мы устанавливали
     */

    @Test
    @Order(10)
    void testValidEmailSet(){
        String validEmail = "valid@test.com";

        person.setEmail(validEmail);
        System.out.println("getEmail: " + person.getEmail());

        Assertions.assertEquals(validEmail, person.getEmail());
    }
    /*
    1. Берем не валидный email
    2. Устанавливаем сеттером не валидный email person-у
    3. Ожидаем результат: Email установлен не будет.
    1) Т.е. значение email у person не будет равно не валидному email
    2) Значение поля email у person останется прежним
    4.
     */

    @ParameterizedTest
    @Order(20)
    @MethodSource("invalidEmailData")
    void testInvalidEmailSet(String invalidEmail) {
        person.setEmail(invalidEmail);
        Assertions.assertNotEquals(invalidEmail, person.getEmail());
        Assertions.assertEquals(startEmail, person.getEmail());
    }

    static Stream<String> invalidEmailData() {
        return Stream.of(
                "testmail.net",
                "test@@mail.net",
                "test@mai@l.net",
                "test@mailnet",
                "test@mail.ne.t",
                "test@mail.net.",
                "test@mailne.t",
                "test@ mail.net",
                "test@ma!il.net",
                "t#est@mail.net",
                "test@mail.?net",
                "@testmail.net",
                "1test@mail.net",
                "_test@mail.net",
                "-t@mail.net",
                ".est@mail.net",
                "test+1@mail.net"

        );
    }

    /*
    1. Берем валидный Password
    2. Устанавливает сеттером валидный Password person-у
    3. Мы ожидаем: что у person в поле Password будет валидный Password, который мы установили на шаге 2
    4. Проверить равенство person.getPassword() c валидным Password, который мы устанавливали
     */
   @Test
   @Order(30)
    void testValidPasswordSet(){
        String validPassword = "Valid47!";

        person.setPassword(validPassword);
       System.out.println("getPassword: " + person.getPassword());

       Assertions.assertEquals(validPassword, person.getPassword());
   }
   /*
    1. Берем не валидный Password
    2. Устанавливаем сеттером не валидный Password person-у
    3. Ожидаем результат: Password установлен не будет.
    1) Т.е. значение Password у person не будет равно не валидному Password
    2) Значение поля Password у person останется прежним
    4.
     */
@ParameterizedTest
@Order(40)
    @MethodSource("InvalidPasswordData")
    void testInvalidPasswordSet(String invalidPassword){
    person.setPassword(invalidPassword);
    Assertions.assertNotEquals(invalidPassword, person.getPassword());
    Assertions.assertEquals(startPassword, person.getPassword());
}
static Stream<String> InvalidPasswordData(){
    return Stream.of(
            "InVal4!",
            "InValid!!!",
            "INVALID47!",
            "invalid47!",
            "InValid47"

    );
}


}

 /*
    test@email.com.net
    1. Должна присутствовать @ и только одна - done
    2. Точка после собаки - done
    3. После последней точки есть 2 или более символов
    4. Алфавит, цифры, '-', '_', '.', '@'
    5. До собаки должен быть хотя бы 1 символ
    6. Первый символ - должна быть буква
     */
/*
Требование к паролю:
1. длина >= 8
2. Должна быть мин 1 цифра
3. Должна быть мин 1 маленькая буква
4. Должна быть мин 1 большая буква
5. Должна быть мин 1 спец. символ (!%$@&*()[].,-)

5 boolean переменных. Каждая "отвечает за свой пункт".
Пароль будет подходить только если все пять - true
return b1 && b2 && b3 && b4 && b5;
 */
