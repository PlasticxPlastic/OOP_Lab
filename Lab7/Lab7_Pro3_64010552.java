package Lab7;

import java.util.Date;

public class Lab7_Pro3_64010552 {
    public static void main(String[] args){
        Person person = new Person("ohm","Venus","0111111111","64010552@kmitl.ac.th");
        Person student = new Student("ohm","Venus","0111111111","64010552@kmitl.ac.th",0);
        Person employee = new Employee("ohm","Venus","0111111111","64010552@kmitl.ac.th","KMITL","20000",new Date());
        Person staff = new Staff("ohm","Venus","0111111111","64010552@kmitl.ac.th","KMITL","20000",new Date(),"Meow");
        Person faculty = new Faculty("ohm","Venus","0111111111","64010552@kmitl.ac.th","KMITL","20000",new Date(),8,"2");
        System.out.println(person);
        System.out.println();
        System.out.println(student);
        System.out.println();
        System.out.println(employee);
        System.out.println();
        System.out.println(staff);
        System.out.println();
        System.out.println(faculty);
    }

}
