package Lab7;

public class Student extends Person {
    private final int FRESHMAN = 0;
    private final int SOPHOMORE = 1;
    private final int JUNIOR = 2;
    private final int SENIOR = 3;
    private int status;

    public Student(String name, String address, String phoneNumber, String emailAddress,int status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    public String getStatus() {
        if(status == 0)
            return "Freshman";
        else if(status == 1)
            return "Sophomore";
        else if(status == 2)
            return "Junior";
        else if(status == 3)
            return "Senior";
        else{
            return "Unknown";
        }
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return "Student\n" + "Name: " + getName() +"\nAddress: " +
                getAddress() + "\nPhone: " + getPhoneNumber() + "\nEmail: " + getEmailAddress()
                +"\nStatus: " + getStatus();
    }
}
