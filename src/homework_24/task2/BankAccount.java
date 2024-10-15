package homework_24.task2;

public class BankAccount implements PaymentSystem{
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdrawMoney(double amount) {

    }

    @Override
    public void depositTransfer(double amount) {
        balance += amount;
        System.out.println("Поступление денег на счет: " + amount + " Остаток: " + balance + " €");

    }

    @Override
    public void checkBalance() {
    System.out.println("Остаток на счете: " + balance);
    }
}
