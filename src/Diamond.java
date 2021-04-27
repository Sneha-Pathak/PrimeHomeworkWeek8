/*
14. Write a program in Java to display the pattern like a diamond.
 While loop
 *
 ***
 *****
 *******
 *********
***********
*************
***********
 *********
 *******
 *****
 ***
 *
 */
public class Diamond
{
    public static void main(String[] args)
    {
        for(int i = 0; i <= 10; i++)
        {
            for(int j = 1; j <= 10 - i; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i - 1; k++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for(int i = 10 - 1; i >= 1; i--)
        {
            for(int j = 1; j <= 10 - i; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i - 1; k++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
