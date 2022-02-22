package Lab7;

import java.util.Date;

public class Employee extends Person{
    private String office;
    private String salary;
    private Date dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress,
                    String office,String salary,Date date_hired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = date_hired;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString(){
        return "Employee\n" + "Name: " + getName() +"\nAddress: " + getAddress() + "\nPhone: " +
                getPhoneNumber() + "\nEmail: " + getEmailAddress()
                + "\nOffice: " + getOffice() + "\nSalary: " + getSalary() + "\nDatehired" + getDateHired();
    }


}
