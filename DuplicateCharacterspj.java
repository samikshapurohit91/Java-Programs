import java.util.*;
class DuplicateCharacterspj{
	public static void main(String [] s){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String : ");

		String s1 = sc.next();

		for(int i = 0; i<s1.length();i++){

			for(int j= i+1; j<s1.length();j++){

				if(s1.charAt(i) == s1.charAt(j)){
					System.out.println("Duplicates in String are : "+s1.charAt(i)); break;
				}
			}
		}
	}
}
