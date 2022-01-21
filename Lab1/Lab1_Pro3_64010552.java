package Lab1;

import java.util.Scanner;

public class Lab1_Pro3_64010552 {
    public static void main(String[] argh)
    {
        //Recieve Input
        System.out.print("Enter a number between 0 and 1000 : ");
        Scanner inputNumber = new Scanner (System.in);
        int number = inputNumber.nextInt();
        inputNumber.close();

        //calculate sum of all digit
        int sum = 0;

        for(int i=1;i<=3;i++)
        {
            sum+=(number % 10);
            number = number/10;
        }

        System.out.println(sum);

    }
}
