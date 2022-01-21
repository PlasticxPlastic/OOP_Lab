package Lab2;

import java.util.Scanner;

public class Lab2_Pro2_64010552 {
    public static void main(String[] argh)
    {
        //Recieve Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Scissor (0) Rock (1) Paper (2) : ");
        int player = scanner.nextInt();
        scanner.close();

        //Config Variable
        int computer = (int) (Math.random() * 3);
        final String[] RPS = {"Scissor","Rock","Paper"};

        if(player < 0 || player > 2)
        {
            System.out.print("Error Number must be 0 or 1 or 2");
        }
        else if((player + 1) % 3 == computer)
        {
            System.out.print("The computer is " + RPS[computer] + ". You are " + RPS[player] + ". You lose");
        }
        else if(player == computer)
        {
            System.out.print("The computer is " + RPS[computer] + ". You are " + RPS[player] + " too. It is draw");
        }
        else
        {
            System.out.print("The computer is " + RPS[computer] + ". You are " + RPS[player] + " . You won");
        }
    }
}
