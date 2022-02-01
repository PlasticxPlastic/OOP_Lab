package Lab4;
import java.util.Arrays;

public class Lab4_Pro3_64010552 {
    public static void main(String[] args){
        final int MAX_LIST = 1000;
        final int MAX_PRIMEPALINDROME = 100;

        StopWatch stopwatch = new StopWatch();

        int countLine = 0;

        float[] numberList = new float[MAX_LIST];

        System.out.println("Creating a list containing 1000 elements,");

        for(int i = 0; i < MAX_LIST;i++)
        {
            numberList[i] = (float) (Math.random() * MAX_LIST);
            System.out.printf("   %10.2f",numberList[i]);
            countLine++;
            if(countLine % 5 == 0)
            {
                System.out.println("");
            }

        }
        countLine = 0;

        System.out.println("List created.");
        stopwatch.start();
        System.out.println("Sorting stopwatch starts...");

        Arrays.sort(numberList);

        for(int i = 0; i < numberList.length;i++){
            System.out.printf("   %10.2f",numberList[i]);
            countLine++;
            if(countLine % 5 == 0)
            {
                System.out.println("");
            }
        }

        System.out.println("Sorting stopwatch stoped.");
        stopwatch.stop();
        System.out.printf("The sort time is " + stopwatch.getElapsedTime() + " milliseconds.\n");
        System.out.println("------------------------------------------------------------");

        stopwatch.start();
        System.out.println("The palindrome prime stopwatch starts...");

        PrimePalindrome.printPalindromePrime(MAX_PRIMEPALINDROME);

        stopwatch.stop();
        System.out.println("The palindrome prime stopwatch stopped.");

        System.out.printf("The palindrome prime time is " + stopwatch.getElapsedTime() + " milliseconds.\n");
    }
}
