package Lab1;

import java.util.Scanner;

public class Lab1_Pro4_64010552 {
    public static void main(String[] argh)
    {
        // Recieve Input Number
        System.out.println("Enter weight in pounds : ");
        Scanner inputNumber = new Scanner(System.in);
        double weightPounds = inputNumber.nextFloat();

        System.out.println("Enter height in inches : ");
        double heightInches = inputNumber.nextFloat();
        inputNumber.close();
        
        //configvariable
        double BMI;
        double weightKilo;
        double heightMeter;

        //calculated Stuff
        weightKilo = weightPounds * 0.45359237f;
        heightMeter = heightInches * 0.0254f;
        BMI = weightKilo/(heightMeter * heightMeter);

        //printout
        System.out.println(BMI);

    }
}
