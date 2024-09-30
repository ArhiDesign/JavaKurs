package lesson_03;

public class HomeWork_03 {
    public static void main(String[] args) {

        // Task 1
        /*
        В классе HomeWork03 задекларировать (объявить) и присвоить значения 3-м переменным. Правильно подберите тип и имя переменным.

Переменная 1 - сколько Вам полных лет
Переменная 2 - должна хранить стоимость 1 литра молока в Вашей стране (без наименования валюты - только цена)
Переменная 3 - Ваше имя (Опционально, так как мы с вами не учили, в каком типе данных хранить можно хранить текст. (Гугл?))
 */


        int myAge;
        myAge = 35;
        double milkPrice;
        milkPrice = 1;
        String myName = "Svetlana";

        System.out.println("Возраст: " + myAge);
        System.out.println("Стоимость молока в $: " + milkPrice);
        System.out.println("Мое имя: " + myName);

// Task 2
        /*
        Объявите 4 переменных типа int со значениями 0, 1, 2, 3.
Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 4. Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
Выведите на экран значение переменной.
Сколько программа отбросила в дробной части?
         */
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int result;

        result = (a + b + c + d) / 4;
        System.out.println("Сумма : " + result);

        int rest = (a + b + c + d) % 4;
        System.out.println("Остаток: " + rest);

// Task 3
        /*
        Пусть цена товара A составляет 1000 Euro, а товара B составляет 500 Euro.

Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.

Выведите на экран значение переменной, которая соответствует стоимости товаров A+B со скидкой.
Отдельно выведите на экран сумму скидки для этой покупки (в деньгах).
         */
        double productA = 1000;
        double productB = 500;
        double discount = 10;

        double sum = (productA + productB) * discount / 100;
        double priceWithDiscount = (productA + productB) - sum;

        System.out.println("Сумма скидки : " + sum);
        System.out.println("Сумма со скидкой: " + priceWithDiscount);

        // Task 4
        /*
        Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю (или придумайте :) ).

       Вычислите среднюю температуру за неделю и выведете ее на печать.
         */
        double monday = 17.5;
        double tuesday = 18.1;
        double wednesday = 19.2;
        double thursday = 21.5;
        double friday = 19.5;
        double saturday = 20.4;
        double sunday = 22.5;
        // TODO

        double caTemp = (monday + tuesday + wednesday + thursday + friday + saturday + sunday) / 7;

        System.out.println("Средняя температура за прошлую неделю : " + caTemp);

        // Второй вариант решения:

        int t1 = 20;
        int t2 = 18;
        int t3 = 22;
        int t4 = 17;
        int t5 = 23;
        int t6 = 21;
        int t7 = 20;

        int days = 7;

        // Сумма всех значений деленная на их количество

        int sumTemp = t1 + t2 + t3 + t4 + t5 + t6 + t7;
        System.out.println("sumTemp: " + sumTemp);

        // x / 7 -> средняя температура
        // 141 / 7 -> 20.14..

//        double averageTemp =  sumTemp /  days; // Обрезается дробная часть в операции деления
        double averageTemp =  sumTemp / (double) days;


        System.out.println("averageTemp: " + averageTemp);



    }
    }



