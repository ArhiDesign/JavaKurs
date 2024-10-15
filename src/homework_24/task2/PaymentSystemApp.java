package homework_24.task2;

public class PaymentSystemApp {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(5000); // €
        ElectronicWallet electronicWallet = new ElectronicWallet(1000); // $



        bankAccount.withdrawMoney(500);
        bankAccount.depositTransfer(1000);

        electronicWallet.withdrawMoney(50);
        electronicWallet.depositTransfer(100);

    }
}
