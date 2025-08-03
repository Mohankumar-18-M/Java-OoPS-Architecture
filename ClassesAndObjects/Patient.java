package ClassesAndObjects;

import java.util.Scanner;

public class Patient {

	String name;
	double height,weight;
	
	double ComputeBMI() {
		return weight/(height*height)*10000;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter patient name : ");
		String name = in.nextLine();
		System.out.print("Enter patient weight : (in kg) ");
		double weight = in.nextDouble();
		System.out.print("Enter patient height : (in cm) ");
		double height = in.nextDouble();
		Patient patient1 = new Patient();
		patient1.name = name;
		patient1.weight = weight;
		patient1.height = height;
		double bmi = patient1.ComputeBMI();
		System.out.println("Pateint BMI : "+bmi);
		in.close();
	}

}
