// This Java program contains a method that prompts a user to enter a string and checks whether the entered string is a palindrome.

mport java.util.*;
public class palindrome_method {

	public static boolean palindrome(String str){
		String reverse = "";
		boolean answer = false;
		for (int i = str.length()-1 ; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
	    }
		if (str.equals(reverse)) {
			answer = true;
		}
		return answer;
	} 
	public static void main(String[] args){
	    Scanner sc= new Scanner(System.in);
	    System.out.println("enter a string");
	    String str=sc.next();
	    str = str.toLowerCase();
	    boolean A = palindrome(str);
	    System.out.println(A);
	 }
}
