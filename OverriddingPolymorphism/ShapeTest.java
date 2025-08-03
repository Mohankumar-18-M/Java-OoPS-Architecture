package OverriddingPolymorphism;

class shape{
	void draw() {
		System.out.println("Drawing shape");
	}
	void erase() {
		System.out.println("Erasing shape");
	}
}

class Circle extends shape{
	void draw() {
		System.out.println("Drawing Circle");
	}
	void erase() {
		System.out.println("Erasing Circle");
	}
}

class Triangle extends shape{
	void draw() {
		System.out.println("Drawing Triangle");
	}
	void erase() {
		System.out.println("Erasing Triangle");
	}
}

class Square extends shape{
	void draw() {
		System.out.println("Drawing Square");
	}
	void erase() {
		System.out.println("Erasing Square");
	}
}
public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape C = new Circle();
		shape T = new Triangle();
		shape S = new Square();
		
		C.draw();
		C.erase();
		T.draw();
		T.erase();
		S.draw();
		S.erase();

	}

}
