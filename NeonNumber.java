import java.util.*;

class NeonNumber {
    public static boolean checkNeon(int n) {
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }
    public static void main(String[] args) {
        //int n = 9;
        System.out.print("Enter the number : " );
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (checkNeon(n))
            System.out.println(  n + " is a Neon number");
        else
            System.out.println( n + " is not a Neon number");
    }
}