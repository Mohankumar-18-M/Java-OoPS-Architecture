package StringAndStringBuffer;

import java.util.Scanner;

public class StringFirstLastSkip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string:");
		String str = in.next();
		if(!str.isEmpty()) {
			System.out.println(str.substring(1, str.length()-1));
		}
		in.close();
	}

}
