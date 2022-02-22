package Lab7;

import Lab5.Account;


public class CheckingAccount extends Account {
    private final double overdraftLimit;

    public CheckingAccount(int id,double balance,double overdraftLimit){
        super(id,balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount){
        if(amount <= 0 || getBalance()-amount >= -overdraftLimit){
            this.setBalance(this.getBalance() - amount);
        }
        else
            System.out.println("Balance is not enough");
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }


    public String toString(){
        return "This account was created at " + getDateCreated();
    }

}
