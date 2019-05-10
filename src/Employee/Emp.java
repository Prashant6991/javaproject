package Employee;
class Employee
{ 
	private String name,desig;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

	}


public class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		Employee e1=new Employee();
		e1.setSalary(50000.0000);
		e1.setName("abc");
		e1.setDesig("General Manager");
		System.out.println(e1.getDesig()+"\t"+e1.getName()+"\t"+e1.getSalary()+"\t");
		}

	
		
		
	}


