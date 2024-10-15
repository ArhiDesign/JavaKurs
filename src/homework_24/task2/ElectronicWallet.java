package homework_24.task2;

public class ElectronicWallet implements PaymentSystem{
    double balance;

    public ElectronicWallet(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdrawMoney(double amount) {

    }

    @Override
    public void depositTransfer(double amount) {
        balance += amount;
        System.out.println("Поступление денег на счет: " + amount + " Остаток: " + balance + " $");

    }

    @Override
    public String toString() {
        return "ElectronicWallet{" +
                "balance=" + balance +
                '}';
    }

   @Override
    public void checkBalance() {
      return;

    }
}
