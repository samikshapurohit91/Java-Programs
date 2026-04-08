import java.util.*;
class Que{
	public static void main(String [] args ){

		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int rev=0;
		int original = n;

		while(n>0){

            int digit = n%10;
            rev = rev*10 + digit;
			n = n/10;

		}
		 if(original==rev){
			 System.out.println("Palindrome");
		 }
		 else{
			 System.out.println("not palindrome");
		 }
	 }
 }
