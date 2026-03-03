import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Fixed: Added missing quotes for the string literal
        System.out.print("Enter a number to check if it's Armstrong: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int result = 0;

        // 1. Find the number of digits (n)
        int digits = String.valueOf(number).length();

        // 2. Calculate the sum of digits raised to the power of n
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            // Use 'digits' instead of a hardcoded 3
            result += Math.pow(remainder, digits);
            originalNumber /= 10;
        }

        // 3. Output the result
        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
