package OverriddingPolymorphism;

class fruit{
	String name;
	String taste;
	String size;
	fruit(String name,String taste,String size){
		this.name = name;
		this.taste = taste;
		this.size = size;
	}
	void Eat() {
		System.out.println("The "+name+" is"+taste+" and size "+size);
	}
}

class Apple extends fruit{
	Apple(String taste,String size){
		super("Apple",taste,size);
	}
	void Eat() {
		System.out.println("The "+name+" is "+taste+" and crunchy");
		System.out.println("size in "+size);
	}
}

class Orange extends fruit{
	Orange(String taste,String size){
		super("Orangr",taste,size);
	}
	void Eat() {
		System.out.println("The "+name+" is "+taste+" and juciy");
		System.out.println("size in "+size);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fruit apple = new Apple("sweet","meduim");
		fruit orange = new Orange("tangy","small");
		apple.Eat();
		orange.Eat();

	}

}
