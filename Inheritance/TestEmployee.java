package Inheritance;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("mohan",60000,2022,"ABC12345");
		emp.display();
		emp.setname("kumar");
		emp.setAnnualsalary(70000);
		emp.setYearStarted(2020);
		emp.setEmployeeInsurenceNm("ABCD321");
		System.out.println();
		emp.display();

	}

}
