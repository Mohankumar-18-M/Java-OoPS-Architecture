package StringAndStringBuffer;

import java.util.Scanner;

public class N_copy_2char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string:");
		String str = in.next();
		int N = str.length();
		while(N>0) {
			System.out.print(str.substring(0, 2));
			N--;
		}
		in.close();
	}

}
