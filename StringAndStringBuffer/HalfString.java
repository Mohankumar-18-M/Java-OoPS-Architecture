package StringAndStringBuffer;

import java.util.Scanner;

public class HalfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string:");
		String str = in.next();
		int N= str.length();
		if(N%2 == 0) {
			System.out.println(str.substring(0, N/2));
		}
		else {
			System.out.println("null");
		}
	in.close();
	}

}
