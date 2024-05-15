package javaProgram;
// encapsulation method
class encapsulation{
	private int empID;
	private int salary;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int i) {
		this.salary = i;
	}
	
}
public class video13 extends encapsulation{

	public static void main(String[] args) {
		
		video13 n= new video13();
		
	   n.setEmpID(23009);
	  System.out.println(n.getEmpID()); 
	  n.setSalary(40000);
	  System.out.println(n.getSalary());

	}

}
