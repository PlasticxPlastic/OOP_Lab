package Lab5;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private final Date dateCreated;


    public Account() {
        this(0, 0);
    }

    public Account(int id, double balance) {
        setID(id);
        setBalance(balance);
        this.dateCreated = new Date();
    }

    public int getID() {
        return this.id;
    }

    public void setID(int id) {
        if(id>=0)
            this.id = id;
        else{
            System.out.println("id should more than or equal to 0");
            System.exit(1);
        }

    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance) {
        if(balance >= 0)
            this.balance = balance;
        else{
            System.out.println("Balance should more than or equal to 0");
            System.exit(1);
        }

    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public double getMonthlyInterest() {
        return this.getMonthlyInterestRate() * this.balance;
    }

    public double getMonthlyInterestRate() {
        return (this.annualInterestRate / 12)/100;
    }

    public void withdraw(double amount) {
        if(balance >= amount && amount > 0)
            this.balance -= amount;
        else{
            System.out.println("Your balance is not enough");
        }

    }

    public void deposit(double amount) {
        if(amount > 0)
            this.balance += amount;
        else{
            System.out.println("Deposit should more than 0");
        }
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        if(annualInterestRate>=0)
            this.annualInterestRate = annualInterestRate;
        else{
            System.out.println("Interest should more than or equal to 0%");
        }
    }
}
