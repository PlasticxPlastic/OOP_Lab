package Lab7;

import java.util.Date;

public class Faculty extends Employee{
    private int officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber,
                   String emailAddress, String office,
                   String salary, Date date_hired,int officeHours,String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, date_hired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString(){
        return "Faculty\n" + "Name: " + getName() +"\nAddress: " + getAddress() + "\nPhone: " +
                getPhoneNumber() + "\nEmail: " + getEmailAddress()
                +"\nOfficehours: " + getOfficeHours() + "\nRank: " + getRank();
    }
}
