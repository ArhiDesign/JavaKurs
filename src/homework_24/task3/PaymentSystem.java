package homework_24.task3;


    public interface PaymentSystem {
        void withdrawMoney(double amount);
        void depositTransfer(double amount);
        double checkBalance();
        void transferMoney(double amount, PaymentSystem recipient); // (перевод средств на другой счет)

        String getCurrency();
        String getTitle();
    }

