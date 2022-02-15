package Lab6;
import Lab5.Account;

import java.util.Scanner;

public class Lab6_Pro6_64010552 {
    static final int CHECK_BALANCE = 1;
    static final int WITHDRAW = 2;
    static final int DEPOSIT = 3;
    static final int EXIT = 4;
    static Account[] accounts = new Account[10];
    static int selectedId = 0;
    static int selectedMenu = -1;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        final double BALANCE = 100;

        for(int id = 0; id < 10;id++){
            accounts[id] = new Account(id,BALANCE);
        }
        while(true){
            System.out.print("Select ID : ");
            selectedId = scanner.nextInt();
            while(selectedId < 0 || selectedId > 9){
                System.out.println("Error id is only 0 - 9");
                System.out.print("Select ID : ");
                selectedId = scanner.nextInt();
            }
            while(true){
                menu();
                if(selectedMenu == CHECK_BALANCE)
                    checkBalance();
                else if(selectedMenu == WITHDRAW)
                    withdraw();
                else if(selectedMenu == DEPOSIT)
                    deposit();
                else if(selectedMenu == EXIT){
                    System.out.println("End of program.\n");
                    break;
                }
            }
        }
    }

    private static void menu(){
        System.out.println("Main menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
        System.out.print("Enter a choice: ");
        selectedMenu = scanner.nextInt();

        while (selectedMenu <= 0 || selectedMenu > 4){
            System.out.println("Error menu is only 1 - 4");
            System.out.print("Enter a choice: ");
            selectedMenu = scanner.nextInt();
        }
    }

    private static void checkBalance(){
        System.out.println("The balance of ID : " + accounts[selectedId].getID() + " is " + accounts[selectedId].getBalance());
        System.out.println();
    }

    private static void withdraw(){
        double amount;
        System.out.print("Enter an amount to withdraw : ");
        amount = scanner.nextDouble();
        while(amount <= 0 || amount > accounts[selectedId].getBalance()){
            System.out.println("Error amount is invalid ");
            System.out.print("Enter an amount to withdraw : ");
            amount = scanner.nextDouble();
        }
        accounts[selectedId].withdraw(amount);
        System.out.println();
    }

    private static void deposit(){
        double amount;
        System.out.print("Enter an amount to deposit : ");
        amount = scanner.nextDouble();
        while (amount <= 0){
            System.out.println("Error amount is invalid ");
            System.out.print("Enter an amount to deposit : ");
            amount = scanner.nextDouble();
        }
        accounts[selectedId].deposit(amount);
        System.out.println();
    }


}
