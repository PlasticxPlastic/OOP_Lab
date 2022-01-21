package Lab2;
import java.util.Scanner;

public class Lab2_Pro5_64010552 {
    public static void main(String[] argh)
    {
        //Recieve input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines : ");
        int line = scanner.nextInt();
        scanner.close();

        //Pyramiding
        if(line <=0 || line > 15)
        {
            System.out.print("Error number of line should not lower than 0 or more than 15");
        }
        else{
            for(int i=1;i<=line;i++)
            {
                for(int j=1;j<=(line-i)*2;j++) //Create Space
                {
                    System.out.print(" ");
                }
                for(int k=i;k>=1;k--) // Printing Number On Left Side
                {
                    System.out.print(" "+k);
                }
                for(int u=2;u<=i;u++) // Printing Number On Right Side
                {
                    System.out.print(" "+u);
                }   
                System.out.println(); //Skip Line
            }
        }
        
    }
}
