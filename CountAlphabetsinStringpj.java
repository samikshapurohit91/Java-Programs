import java.util.*;
class CountAlphabetsinStringpj{
	public static void main(String [] s){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s1 = sc.nextLine();
		int count=0;

		for(int i = 0; i<= s1.length()-1; i++){

			if(s1.charAt(i) == ' '){
			count--;
		   }

			count++;

		}
		System.out.println("Alphabets in String : "+count);
	}
}
