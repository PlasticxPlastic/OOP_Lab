package Lab7;
import java.util.Date;
public class Transaction {
    private Date date;
    private Character type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type,double amount,double balance,String description){
        this.type = type;
        this.balance = balance;
        this.amount = amount;
        this.description = description;
        this.date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public Character getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setType(Character type) {
        this.type = type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
