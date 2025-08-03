package EncapsulationAndAbstraction;

public class Author {

	private String name,email;
	private char gender;
	int a=10;
	
	Author(String name,String email,char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	void Author_display() {
		System.out.println(name);
		System.out.println(email);
		System.out.println(gender);
	}


}
