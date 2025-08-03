package StringAndStringBuffer;

import java.util.Scanner;

public class StringConcatenator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string:");
		String str1 = in.next();
		String str2 = in.next();
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if(!str1.isEmpty() && !str2.isEmpty()&&str1.charAt(str1.length()-1)==str2.charAt(0)) {
			str2 = str2.substring(1);
			str1 = str1+str2;
			flag = true;
			
		}
		if(flag == true) {
		System.out.println(str1);
		}
		else {
			System.out.println(str1+" "+str2);
		}
		in.close();
	}

}
