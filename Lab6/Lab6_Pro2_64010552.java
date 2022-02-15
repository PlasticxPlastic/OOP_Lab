package Lab6;

public class Lab6_Pro2_64010552 {
    public static void main(String[] args){
        Course course = new Course("OOP");
        course.addStudent("one");
        course.addStudent("two");
        course.addStudent("three");
        course.dropStudent("three");
        course.display();
        System.out.println();
        course.clearStudent();
        course.display();
    }
}
