package Lab7;

import java.util.Date;

public class Staff extends Employee{
    private String title;

    public Staff(String name, String address, String phoneNumber,
                 String emailAddress, String office,
                 String salary, Date date_hired,String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, date_hired);
        this.title =title;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString(){
        return "Staff\n" + "Name: " + getName() +"\nAddress: " + getAddress() + "\nPhone: " +
                getPhoneNumber() + "\nEmail: " + getEmailAddress()
                +"\nTitle: " + getTitle();
    }
}
