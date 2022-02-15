package Lab6;

import java.util.Scanner;

public class Lab6_Pro1_64010552 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String name;
        int age, feet, inches;
        double weight;

        System.out.print("Enter your name : ");
        name = scanner.nextLine();
        while(name.isBlank()){
            System.out.println("Error : name cant blank");
            System.out.print("Enter your name : ");
            name = scanner.nextLine();
        }

        System.out.print("Enter your age : ");
        age = scanner.nextInt();
        while(age < 1){
            System.out.println("Error : age cannot lower than 1");
            System.out.print("Enter your age : ");
            age = scanner.nextInt();
        }

        System.out.print("Enter your weight in pounds : ");
        weight = scanner.nextDouble();
        while(weight < 1){
            System.out.println("Error : weight cannot lower than 1");
            System.out.print("Enter your weight in pounds : ");
            weight = scanner.nextDouble();
        }

        System.out.println("Enter your height in feet and inches");
        System.out.print("feet : ");
        feet = scanner.nextInt();
        System.out.print("inches : ");
        inches = scanner.nextInt();
        while(feet < 1 || inches < 1 || inches > 12){
            System.out.println("Error : input invalid");
            System.out.println("Enter your height in feet and inches");
            System.out.print("feet : ");
            feet = scanner.nextInt();
            System.out.print("inches : ");
            inches = scanner.nextInt();
        }
        scanner.close();
        BMI userBMI = new BMI(name, age, weight, feet, inches);
        System.out.println();
        System.out.println("\tName : " + userBMI.getName());
        System.out.println("\tAge : " + userBMI.getAge());
        System.out.println("\tWeight : " + userBMI.getWeight());
        System.out.println("\tHeight : " + userBMI.getInches() + " inches " + userBMI.getFeet() + " Feet");
        System.out.println("\tBMI : " + userBMI.getBmi() + "  " + BMI.resultBMI(userBMI.getBmi()));
    }
}
