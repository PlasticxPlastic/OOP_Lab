package Lab2;

import java.util.Scanner;

public class Lab2_Pro4_64010552 {
    static String[] city = { "", "", "" };

    public static void main(String[] args) 
    {
        String[] cities = new String[3];

        //Recieve Input  
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first city : ");
        cities[0] = scanner.nextLine();
        System.out.print("Enter the second city : ");
        cities[1] = scanner.nextLine();
        System.out.print("Enter the third city : ");
        cities[2] = scanner.nextLine();
        scanner.close();

        //Sorting Cities
        if (cities[1].compareToIgnoreCase(cities[0]) < 0 && cities[1].compareToIgnoreCase(cities[2]) < 0) { //check if city 2 is the first one or not
            String temp = cities[0];
            cities[0] = cities[1];
            cities[1] = temp;
        } 
        else if (cities[2].compareToIgnoreCase(cities[0]) < 0) { // if city 2 is the first one check if the third came before city1
            String temp = cities[0];
            cities[0] = cities[2];
            cities[2] = temp;
        }
        if (cities[2].compareToIgnoreCase(cities[1]) < 0) { // if city 3 is came before city 2 swap position between city 3 and 2
            String temp = cities[1];
            cities[1] = cities[2];
            cities[2] = temp;
        }        //else out of this is sorted correctly

        //print
        System.out.println("The three cities in alphabetical order are " + cities[0] + " " + cities[1] + " " + cities[2]);
    }
}
