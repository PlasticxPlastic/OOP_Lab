package Lab7;

public class Lab7_Pro2_64010552 {
    public static void main(String[] args) {
        NewAccount accountGeorge = new NewAccount("George", 1122, 1000);
        accountGeorge.setAnnualInterestRate(0.015);
        accountGeorge.deposit(30);
        accountGeorge.deposit(40);
        accountGeorge.deposit(50);
        accountGeorge.withdraw(5);
        accountGeorge.withdraw(4);
        accountGeorge.withdraw(2);

        System.out.println("Name: " + accountGeorge.getName());
        System.out.println("Account ID: " + accountGeorge.getID());
        System.out.println("Annual interest rate: " + accountGeorge.getAnnualInterestRate() * 100);
        System.out.println("Balance: " + accountGeorge.getBalance());

        System.out.println("Date\t\t\t\t\t\t\t\t\tType\t\t\tAmount\t\t\tBalance");

        for (Transaction transaction : accountGeorge.getTransactions()) {
            System.out.printf("%s\t\t\t", transaction.getDate());
            System.out.printf("%s\t\t\t\t", transaction.getType());
            System.out.printf("%.2f\t\t\t", transaction.getAmount());
            System.out.println(transaction.getBalance());
        }
    }
}