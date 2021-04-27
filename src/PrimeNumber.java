import java.util.Scanner;

/*
12. Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17.... are the prime numbers.)
 */
public class PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int no = sc.nextInt();

        if (isPrime(no))
            System.out.println(no + " Prime no...");

        else
            System.out.println("Not Prime no...");
    }

    // Check for number prime or not
    public static boolean isPrime(int n)
    {
        // Check if number is less than
        // equal to 1
        if (n <= 1)
            return false;

            // Check if number is 2
        else if (n == 2)
            return true;

            // Check if n is a multiple of 2
        else if (n % 2 == 0)
            return false;

        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
