package Lab7;

import Lab5.Account;

public class SavingAccount extends Account {
    public SavingAccount(int id,double balance){
        super(id,balance);
    }
    public String toString(){
        return "This account was created at " + getDateCreated();
    }
}
