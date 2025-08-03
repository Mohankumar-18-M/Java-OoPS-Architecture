package Inheritance;

class Person1{
	String name;
	String dateofBirth;
	
	Person1(String name,String dateofBirth){
		this.name = name;
		this.dateofBirth = dateofBirth;
	}
	void displayPerson() {
		System.out.println("Name : "+name);
		System.out.println("date of birth : "+dateofBirth);
	}
}

class Teacher extends Person1{
	double salary;
	String subject;
	
	Teacher(String name,String dateofbirth,double salary,String subject){
		super(name,dateofbirth);
		this.salary = salary;
		this.subject = subject;
	}
	void displayTeacher() {
		displayPerson();
		System.out.println("Salary : "+salary);
		System.out.println("Subject : "+subject);
	}
}

class Student extends Person1{
	String studentId;
	Student(String name,String dateofbirth,String studentId){
		super(name,dateofbirth);
		this.studentId = studentId;
	}
	void displayStudent() {
		displayPerson();
		System.out.println("Student Id : "+studentId);
	}
}

class CollegeStudent extends Student{
	String collegename;
	String year;
	CollegeStudent(String name,String dateofbirth,String studentId,String collegename,String year){
		super(name,dateofbirth,studentId);
		this.collegename = collegename;
		this.year = year;
	}
	void displayCollege() {
		displayStudent();
		System.out.println("College Name : "+collegename);
		System.out.println("year : "+year);
	}
}
public class SchoolApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Person:");
		Person1 person = new Person1("Mohan","18-5-2005");
		person.displayPerson();
		System.out.println();
		System.out.println("Teacher:");
		Teacher teacher = new Teacher("Mr.mohankumar","18-05-2005",60000,"Tamil");
		teacher.displayTeacher();
		System.out.println();
		System.out.println("Student");
		Student student = new Student("mohankumar","18-5-2005","621322106062");
		student.displayStudent();
		System.out.println();
		System.out.println("College student");
		CollegeStudent collegestudent = new CollegeStudent("Mohankumar","18-5-2005","621322106062","KNCET","Final");
		collegestudent.displayCollege();

	}

}
