package Lab4;

public class PrimePalindrome {
    public static void printPalindromePrime(int maxNumber){
        int count = 0;
        int number = 2;
        while(count < maxNumber){
            if(isPalindrome(number) && isPrime(number)){
                System.out.print(number + " ");
                count++;
                if(count%10 == 0){
                    System.out.println("");
                }
            }
            number++;
        }
    }
    public static boolean isPrime(int number){
        int b = 0;
        for(int i = 2; i <= Math.sqrt(number) ; i++)
        {
            if(number % i == 0){ //if all number not include itself divided and only 1 number make mod = 0 that number is prime
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int number){
        int remain,sum = 0,temp;
        temp = number;
        while(number > 0){      //check if we rearrange number and it same number as before then that number is palindrome
            remain = number%10;
            sum = (sum*10)+remain;
            number = number/10;
        }
        if(temp == sum) {
            return true;
        } else {
            return false;
        }
    }
}
