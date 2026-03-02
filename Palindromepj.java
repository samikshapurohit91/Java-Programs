import java.util.*;
class Palindromepj{
	public static void main(String [] s){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Number : ");
		int n = sc.nextInt();

		int original = n;
		int reverse = 0;

		for(;n >0 ; n = n/10){

			int digit = n%10;
			reverse = reverse*10 + digit;

		}
		if(original == reverse){
			System.out.println(original + " is Palindrome  number ");
		}
		else{
			System.out.println(original + " is not Palindrome  number ");

	}
}
}

