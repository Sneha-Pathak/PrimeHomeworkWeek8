/*
11. Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative NOTE: The method getEvenDigitSum should be defined as public static
 */

public class EvenDigitSum
{
    //To find the sum of even digits in a given Number

    public static int getEvenDigitSum(int number)
    {
        if(number < 0)
        {
            return -1;
        }
        int finalNumber = 0;
        while(number > 0)
        {
            if((number % 10) % 2 == 0)
            {
                finalNumber += number%10;
            }
            number = number/10; //takes out last digit to test the next digit
        }
        return finalNumber;
    }

    public static void main(String[] args)
    {
        System.out.println(getEvenDigitSum(123456789)); //should return 20 since 2 + 4 + 6 + 8 = 20
        System.out.println(getEvenDigitSum(252)); // should return 4 since 2 + 2 = 4
        System.out.println(getEvenDigitSum(-22)); // should return -1
    }
}
