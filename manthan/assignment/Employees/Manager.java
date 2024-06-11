package manthan.assignment.Employees;

//inherit form Employee
public class Manager extends Employee {

	private String department;

	//parameter constructor
    public Manager(String name, int employeeId, double salary, String department) {
        //Employee Var 
    	super(name, employeeId, salary);
        this.department = department;
    }

  //get and set methods
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

  //for printing all data when obj is called
	@Override
	public String toString() {
		return "Manager= department:" + department ;
	}
	
}
