package Lab6;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents = 0;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void display(){
        System.out.println("course name : " + this.courseName);
        System.out.println("number of students : " + this.numberOfStudents);
        if(numberOfStudents!= 0){
            for(int i = 0; i < this.students.length; i++){
                System.out.println("student " + (i+1) + " : " + this.students[i]);
            }
        }
        else
            System.out.println("No one in this class");
    }

    public void dropStudent(String studentName){
        if(this.students == null)
            return;
        int deleteStudent = -1;
        for(int i = 0; i < this.students.length; i++){
            if(this.students[i].equals(studentName))
                deleteStudent = i;
        }
        if(deleteStudent == -1)
            return;
        while(deleteStudent != students.length - 1){
            this.students[deleteStudent] = this.students[deleteStudent+1];
            deleteStudent++;
        }
        this.numberOfStudents--;
        String[] studentCopy = new String[this.numberOfStudents];
        System.arraycopy(this.students, 0, studentCopy, 0 ,this.numberOfStudents);
        this.students = studentCopy;
    }

    public void clearStudent(){
        if(this.students == null)
            return;

        this.students = null;
        this.numberOfStudents = 0;
    }

    public void addStudent(String studentName){
        if(this.numberOfStudents == 0){
            this.students = new String[1];
            this.students[0] = studentName;
            this.numberOfStudents = 1;
            return;
        }
        this.numberOfStudents++;
        String[] studentCopy = this.students;
        this.students = new String[this.numberOfStudents];
        System.arraycopy(studentCopy,0,this.students,0,studentCopy.length);
        this.students[numberOfStudents-1] = studentName;
    }

    public String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return  numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }

    public int getStudentLenght(){
        return this.students.length;
    }

}
