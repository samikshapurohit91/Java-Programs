import java.util.*;
class Factorialpj{

     public static void main(String[] args)
        {
            //int num = 5;
            System.out.print("Enter the number : " );
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println("Factorial of " + num + " is "
                               + factorial(num));
    }

    static int factorial(int n)
    {
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;
    }



}