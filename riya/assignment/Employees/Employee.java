package manthan.assignment.Employees;

public class Employee {

	//access modifiers And Var
	private String name;
    private int employeeId;
    private double salary;
    
    //parameter constructor
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    //get and set methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;

    }

    //for printing all data when obj is called
	@Override
	public String toString() {
		return "Employee name:" + name + ", employeeId:" + employeeId + ", salary:" + salary ;
	}
	
	
}
