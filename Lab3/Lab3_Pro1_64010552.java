package Lab3;

public class Lab3_Pro1_64010552 {
    public static void main(String[] args){
        int prime_palindrome_count = 0;
        int skip_line_count = 0;
        int number = 2;

        while (prime_palindrome_count < 100) //print first 100 number
        {
            if(isPrime(number) && isPalindrome(number)) //check if number is prime and palindrome
            {
                if(skip_line_count < 9) // check if the number is not the end of line
                {
                    System.out.print(number + " ");
                    skip_line_count++;
                }
                else //if number is the end of line
                {
                    System.out.println(number);
                    skip_line_count = 0;
                }
                prime_palindrome_count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int number) // check if number is prime number or not
    {
        int b = 0;
        for(int i = 2; i <= Math.sqrt(number) ; i++)
        {
            if(number % i == 0){ //if all number not include itself divided and only 1 number make mod = 0 that number is prime
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int number) //check palindrome
    {
        int remain,sum = 0,temp;
        temp = number;
        while(number > 0){      //check if we rearrange number and it same number as before then that number is palindrome
            remain = number%10;
            sum = (sum*10)+remain;
            number = number/10;
        }
        if(temp == sum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
