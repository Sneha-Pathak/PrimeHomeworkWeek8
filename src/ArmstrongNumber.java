import java.util.Scanner;

/*
10. Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153
 */
public class ArmstrongNumber
{
    public void isArmstrong(int num)
    {
        int remainder = 0, result = 0;
        int originalNum = num;

        while (originalNum != 0)
        {
            remainder = originalNum % 10;
            result += Math.pow(remainder, 3);
            originalNum /= 10;
        }

        if(result == num)
        {
            System.out.println(num + " is an Armstrong number.");
        }
        else
        {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int no = sc.nextInt();

        // Armstrong no Ex : 153, 371, 9474
        ArmstrongNumber arm = new ArmstrongNumber();
        arm.isArmstrong(no);
    }
}
