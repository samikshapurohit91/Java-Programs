import java.util.*;
class Anagrampj{
	public static void main(String [] s){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String : " );
		String s1 = sc.next();

		System.out.println("Enter 2nd String : ");
		String s2 = sc.next();

		if(s1.length() == s2.length()){
			System.out.println("Checked ! ");
		}else{
			System.out.println("Not Suitable for Anagram!");
		}

		char [] a = s1.toCharArray();
		char [] b= s2.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		if( Arrays.equals(a,b)){
			System.out.println(s1 + " and " + s2 + " are Anagrams ");
		}else{
			System.out.println(s1 + " and " + s2 + " are not Anagrams ");
	  }
	}
}
