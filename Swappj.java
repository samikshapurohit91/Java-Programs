import java.util.*;
class Swappj{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("-- Before Swapping --");
		System.out.print("x: ");
		int x = sc.nextInt();

		System.out.print("y: ");
		int y = sc.nextInt();

		int temp = 0;

		temp = x;
		x= y;
		y = temp;
		System.out.println("-- After Swapping --");

		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
}