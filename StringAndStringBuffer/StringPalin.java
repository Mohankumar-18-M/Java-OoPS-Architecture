package StringAndStringBuffer;

import java.util.Scanner;

public class StringPalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		boolean result = true;
		System.out.print("Enter a string:");
		String str1 = ob.nextLine();
		int i=0;
		int j=str1.length()-1;
		while(i<str1.length()) {
				if(str1.charAt(i) != str1.charAt(j)) {
					result = false;
					break;
				}
				i++;
				j--;
		}
		
		if(result == true) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palin");
		}
		ob.close();

	}

}
