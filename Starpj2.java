import java.util.*;
class Starpj2{
	public static void main(String [] s){

		System.out.print("Enter your Number for StarPattern: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		//int n=5;
		for(int i = 1; i<=n;i++){

			for(int j= 5;j>=i;j--){

				System.out.print("* ");
			}
			System.out.println();
		}
	}
}