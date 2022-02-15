package Lab6;

import java.util.Scanner;

public class Lab6_Pro4_64010552 {
    static final double[] RATES = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
    static final int[][] BRACKETS = {
            {8350, 33950, 82250, 171550, 372950},
            {16700, 67900, 137050, 208850, 372950},
            {8350, 33950, 68525, 104425, 186475},
            {11950, 45500, 117450, 190200, 372950}
    };
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int status;
        double income;
        double tax;
        System.out.println("Filing Status");
        System.out.println("[0]-Single filer");
        System.out.println("[1]-Married jointly or qualifying widow[er]");
        System.out.println("[2]-Married separately");
        System.out.println("[3]-Head of household");

        System.out.print("Enter the filing status: ");
        status = scanner.nextInt();
        while(status < 0 || status > 3){
            System.out.println("Error : status invalid");
            System.out.print("Enter the filing status: ");
            status = scanner.nextInt();
        }
        System.out.print("Enter the taxable income: ");
        income = scanner.nextDouble();
        while(income < 0){
            System.out.println("Error income is invalid");
            System.out.print("Enter the taxable income: ");
            income = scanner.nextDouble();
        }
        scanner.close();
        if(income <= BRACKETS[(int)status][0]){
            tax = income * RATES[0];
        }
        else if(income <= BRACKETS[(int)status][1]){
            tax = (BRACKETS[(int)status][0] * RATES[0]) + (income - BRACKETS[(int) status][0]) * RATES[1];
        }
        else if(income <= BRACKETS[(int)status][2]){
            tax = (BRACKETS[(int)status][0] * RATES[0]) +
                    (BRACKETS[(int) status][1] - BRACKETS[(int) status][0]) * RATES[1] +
                    (income - BRACKETS[(int) status][1]) * RATES[2];
        }
        else if(income <= BRACKETS[(int) status][3]){
            tax = (BRACKETS[(int)status][0] * RATES[0]) +
                    (BRACKETS[(int) status][1] - BRACKETS[(int) status][0]) * RATES[1] +
                    (BRACKETS[(int) status][2] - BRACKETS[(int) status][1]) * RATES[2] +
                    (income - BRACKETS[(int) status][2]) * RATES[3];
        }
        else if(income <= BRACKETS[(int) status][4]){
            tax = (BRACKETS[(int)status][0] * RATES[0]) +
                    (BRACKETS[(int) status][1] - BRACKETS[(int) status][0]) * RATES[1] +
                    (BRACKETS[(int) status][2] - BRACKETS[(int) status][1]) * RATES[2] +
                    (BRACKETS[(int) status][3] - BRACKETS[(int) status][2]) * RATES[3] +
                    (income - BRACKETS[(int) status][3]) * RATES[4];
        }
        else{
            tax = (BRACKETS[(int)status][0] * RATES[0]) +
                    (BRACKETS[(int) status][1] - BRACKETS[(int) status][0]) * RATES[1] +
                    (BRACKETS[(int) status][2] - BRACKETS[(int) status][1]) * RATES[2] +
                    (BRACKETS[(int) status][3] - BRACKETS[(int) status][2]) * RATES[3] +
                    (BRACKETS[(int) status][4] - BRACKETS[(int) status][3]) * RATES[4] +
                    (income - BRACKETS[(int) status][4]) * RATES[5];
        }

        System.out.println("Tax is " + tax);
    }

}
