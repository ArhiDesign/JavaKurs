package homework_24.task2;

public class PaymentSystemApp {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(10000, "ABank");

        System.out.println(bankAccount);

        bankAccount.withdrawMoney(100000);
        System.out.println(bankAccount.checkBalance());

        bankAccount.withdrawMoney(150);
        bankAccount.depositTransfer(50000);
        System.out.println(bankAccount.checkBalance());

        ElectronicWallet wallet = new ElectronicWallet(2, "Bin wallet");
        System.out.println(wallet);

        wallet.withdrawMoney(.5);
        System.out.println(wallet.checkBalance());

    }
}
