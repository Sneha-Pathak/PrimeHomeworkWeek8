/*
8. Display right angle triangle of @ using nested for loops
 @
 @@
 @@@
 @@@@
 @@@@@
 */

public class Triangle2
{
    public static void main(String[] args)
    {
        for( int i=0; i<=5; i++ )
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("@");
            }
            System.out.println(" ");
        }
    }
}
