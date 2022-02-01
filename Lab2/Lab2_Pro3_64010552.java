package Lab2;
import java.util.Scanner;

public class Lab2_Pro3_64010552 {
    public static void main(String[] args) 
    {
        //Recieve Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year :");
        int y = scanner.nextInt();
        System.out.print("Enter month 1-12:");
        int month = scanner.nextInt();
        System.out.print("Enter day 1-31 :");
        int q = scanner.nextInt();
        scanner.close();

        //Error year Check
        if(y <= 0 )
        {
            System.out.print("year cannot be less than 0"); 
            System.exit(0);
        }
        //Error month Check
        if(month > 12 || month <= 0)
        {
            System.out.print("month cannot be less than 1 or more than 12"); 
            System.exit(0);
        }
        //check month 31 day
        if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (q <=0 || q > 31))
        {
            System.out.print("day is invalid plese check again"); 
            System.exit(0);
        }
        //check month 30 day
        if((month == 4 || month == 6 || month == 9 || month == 11 ) && (q <= 0 || q > 30))
        {
            System.out.print("day is invalid plese check again"); 
            System.exit(0);
        }
        
        // check leap year
        // if the year is divided by 4
    if (month == 2 && y % 4 == 0) {
        // if the year is century
        if (y % 100 == 0) {
          // if year is divided by 400
          if (y % 400 == 0)
          {
            if(q < 1 || q > 29)
            {
                System.out.print("if month is Febuary (leap year) day should not less than 1 or more than 29");
                System.exit(0);
            } 
          }
          else
          {
              if(q < 1 || q > 28)
              {
                System.out.print("day should not less than 1 or more than 28");
                System.exit(0);
              }
          }
        }
        // if the year is not century
        else{
            System.out.print("day should not less than 1 or more than 28");
            System.exit(0);
        }
      }
    else
    {
        if(month == 2 && (q < 1 || q > 28))
        {
            System.out.print("day should not less than 1 or more than 28");
            System.exit(0);
        }
    }

        //Calculate Day  
    int m = 0;
    String day[]= {"Saturday","Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    if(month == 1 || month == 2){
        m+=12;
        y--;
    }
    else{
        m = month;
    }
    int j = y/100;
    int k = y%100;
    int h = (q + (int)((26 * (m + 1)) / 10) + k + (int)(k / 4) + (int)(j / 4) + (5 * j)) % 7;

    //Printout
    System.out.println(day[h]); 
    }
}
