import java.util.Scanner;

/*
2. -Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
 */
public class MinAndMaxInputChallenge
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Minimum And Maximum
        int count = 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        while (true){
            int cnt = count++;
            System.out.print("Enter Number #"+(cnt+1)+": ");
            boolean isValid = input.hasNextInt();
            if(isValid){
                int num = input.nextInt();

                if (num < min) {
                    min = num;
                }else if (num > max){
                    max = num;
                }
            }
            else
            {
                System.out.println("Invalid input..");
                break;
            }
            input.nextLine();
        }
        System.out.println("Min Number : " + min);
        System.out.println("Max Number : " + max);
    }
}
