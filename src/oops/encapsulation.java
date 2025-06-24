package oops;
class employee{
	private int id;
	private String name;
	private String email;
	private double salary;
	
//	all args constructor
	public employee(int id , String name , String email ,double salary){
		this.id=id;
		this.name=name;
		this.email=email;
		this.salary=salary;
	}
//	getters
	public int getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	public String getemail() {
		return email;
	}
	public double getsalary() {
		return salary;
	}
	
//	setters
	public void setid(int id) {	
		this.id=id;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setemail(String email) {
		this.email=email;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	
//	no args constructor
	
	public employee() {
		super();
	}
	
	public void updatesalary(double newsalary) {
		if(newsalary > 0) {
			this.salary=newsalary;
			System.out.println("salary updated to: "+newsalary);
		}
		else {
			System.out.println("invalid salary");
		}
	}
}
class HRdepartment{
	public void increasesalary(employee e , double newsalary) {
		e.updatesalary(newsalary);
	}
}
public class encapsulation {
	public static void main(String[] args) {
		employee e=new employee(2006 , "nani", "nani@gmail.com" , 24400.00);
		System.out.println("employee id: "+e.getid());
		System.out.println("employee name: "+e.getname());
		System.out.println("employee email: "+e.getemail());
		System.out.println("employee salary: "+e.getsalary());
		HRdepartment hr=new HRdepartment();
		hr.increasesalary(e, 30000.00);
		System.out.println("updated salary is: "+e.getsalary());
	}
}