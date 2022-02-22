package Lab7;

import Lab5.Account;

import java.util.ArrayList;

public class NewAccount extends Account {
    private String name;
    private final ArrayList<Transaction> transactions = new ArrayList<>();

    public NewAccount(String name,int id, double balance){
        super(id, balance);
        this.name = name;
    }

    public void withdraw(double amount){
        this.withdraw(amount, "");
    }

    public void withdraw(double amount, String detail) {
        super.withdraw(amount);
        this.transactions.add(new Transaction(
                'W', amount, getBalance(), detail)
        );
    }

    public void deposit(double amount){this.deposit(amount, "");}

    public void deposit(double amount, String detail){
        super.deposit(amount);
        this.transactions.add(new Transaction(
                'D', amount, getBalance(), detail)
        );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}
