package Lab2;
import java.util.Scanner;

public class Lab2_Pro1_64010552 {
    public static void main(String[] args)
    {
        //Recieve Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter today's day : ");
        int today = scanner.nextInt();
        System.out.print("Enter the number of days elapsed since today : ");
        int future = scanner.nextInt();
        scanner.close();

        if(today < 0 || today > 6)
        {
            System.out.print("Error Your day is invalid must be 0-6");
            System.exit(0);
        }
        else if(future <= 0)
        {
            System.out.print("Error number of days elapsed should not less than 1");
            System.exit(0);
        }

        //Setting Variable
        String day[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday",};
        int day_future = today + future;

        //Calculate
        day_future = day_future % 7;

        //printout
        System.out.println("Today is " + day[today] + " and the future day is " + day[day_future]); 
        

    }
}
