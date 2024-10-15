package homework_24.task2;
/*
Task 2
Платежные системы
Создайте интерфейс PaymentSystem с методами:
withdrawMoney(double amount) (Снятие со счета) - списываются деньги со счета
depositTransfer(double amount) (Поступление денег на счет);
checkBalance() (Остаток на счете).
Напишите классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.
Банк предоставляет счета, например, в евро, а электронный кошелек в другой валюте
Убедитесь, что каждый класс корректно выполняет каждую из операций.
 */
public interface PaymentSystem {
    void withdrawMoney(double amount);// Снятие со счета
    void depositTransfer(double amount);//Поступление денег на счет
    void checkBalance();   //Остаток на счете
}

