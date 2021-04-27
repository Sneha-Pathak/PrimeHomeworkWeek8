/*
9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Fibonacci
{
    public static void main(String[] args)
    {
        int n = 10, t1 = 1 , t2 = 1;
        System.out.println("Fibonacci series..");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
