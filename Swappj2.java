import java.util.*;
class Swappj2{
	public static void main(String [] s){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter 1st number : ");
		int a= sc.nextInt();

		System.out.print("Enter 2nd number : ");
		int b = sc.nextInt();

		System.out.println("-- Before Swapping --");
		System.out.println("a : "+a);
		System.out.println("b : "+b);

	//	a= a+b;
	//	b= a-b;
	//	a= a-b;

	//	a = a^b;
	//	b = a^b;
	//	a = a^b;

		a=(a + b)-(b = a);

		System.out.println("-- After Swapping --");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
}






























