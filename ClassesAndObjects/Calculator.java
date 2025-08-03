package ClassesAndObjects;

import java.util.Scanner;

public class Calculator {
	
	static int PowerInt(int num1,int num2) {
		return (int) Math.pow(num1, num2);
	}
	
	static double PowerDouble(double num1,double num2) {
		return Math.pow(num1, num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("enter int values :");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		System.out.println(PowerInt(num1,num2));
		System.out.println();
		System.out.print("enter double values :");
		double num3 = in.nextInt();
		double num4 = in.nextInt();
		System.out.println(PowerDouble(num3,num4));
		in.close();
	}

}
