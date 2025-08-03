package ClassesAndObjects;

import java.util.Scanner;

public class ClassBox {

	int height,width,depth;
	ClassBox(int height,int width,int depth){
		this.depth = depth;
		this.height = height;
		this.width = width;
	}
	
	int  CalculateVolume() {
		return height*depth*width;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Height of box : ");
		int height = in.nextInt();
		System.out.print("Enter width of box : ");
		int width = in.nextInt();
		System.out.print("Enter depth of box : ");
		int depth = in.nextInt();
		ClassBox box = new ClassBox(height,width,depth);
		int volume = box.CalculateVolume();
		System.out.println("Volume of box : "+volume);
		in.close();
	}

}
