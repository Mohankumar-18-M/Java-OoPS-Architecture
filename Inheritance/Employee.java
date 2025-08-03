package Inheritance;

public class Employee extends Person {
	private double annualsalary;
	private int YearStarted;
	private String EmployeeInsurenceNm;
	public Employee(String Name,double annualsalary,int Yearstarted,String EmployeeInsurenceNm) {
		super(Name);
		this.annualsalary = annualsalary;
		this.YearStarted = Yearstarted;
		this.EmployeeInsurenceNm = EmployeeInsurenceNm;
		
	}
	public double getAnnualsalary() {
		return annualsalary;
	}
	public int getYearStarted() {
		return YearStarted;
	}
	public String getEmployeeInsurenceNm() {
		return EmployeeInsurenceNm;
	}
	public void setAnnualsalary(double annualsalary) {
		this.annualsalary = annualsalary;
	}
	public void setYearStarted(int YearStarted) {
		this.YearStarted = YearStarted;
	}
	public void setEmployeeInsurenceNm(String EmployeeInsurenceNm) {
		this.EmployeeInsurenceNm = EmployeeInsurenceNm;
	}
	public void display() {
		System.out.println("Name : "+getName());
		System.out.println("Annual Salary : "+annualsalary);
		System.out.println("Year Started : "+YearStarted);
		System.out.println("National Insurence Number : "+EmployeeInsurenceNm);
	}
}
