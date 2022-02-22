package Lab7;
import Lab5.Account;

public class Lab7_Pro1_64010552 {
    public static void main(String[] args){

        Account account = new Account(0,5000);
        System.out.println("Normal Account");
        System.out.println("Balance is "+ account.getBalance());
        account.withdraw(200);
        System.out.println("Withdraw: 10000.00");
        System.out.println("Balance is "+ account.getBalance());
        System.out.println(account);
        System.out.println();

        CheckingAccount checkingAccount = new CheckingAccount(1, 5000, 5000);
        System.out.println("Checking Account");
        System.out.println("Overdraft Limit: " + checkingAccount.getOverdraftLimit());
        System.out.println("Balance is " + checkingAccount.getBalance());
        checkingAccount.withdraw(10000);
        System.out.println("Withdraw: 10000.00");
        System.out.println("Balance is " + checkingAccount.getBalance());
        System.out.println(checkingAccount);
        System.out.println();

        SavingAccount savingAccount = new SavingAccount(2, 5000);
        System.out.println("Saving Account");
        System.out.println("Balance is "+ savingAccount.getBalance());
        savingAccount.withdraw( 10000);
        System.out.println("Withdraw: 10000.00");
        System.out.println("Balance is "+ savingAccount.getBalance());
        System.out.println(savingAccount);
    }
}
