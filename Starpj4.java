import java.util.*;
class Starpj4{
	public static void main(String [] s){

		System.out.print("Enter your Number for StarPattern: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		//int n=5;
		for(int i = 1; i<=n;i++){

			for(int j= 0;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=5 ; k>=i;k--){

				System.out.print("*");
		   }

			System.out.println();
		}
	}
}