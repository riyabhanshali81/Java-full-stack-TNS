package manthan.assignment.utilities;

//Import all manthan employees classes
import manthan.assignment.Employees.*;

public class EmployeeUtilities {

	//print all details
	public static void displayEmployeeDetails(Employee employee) {
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
    }

    public static void giveRaise(Employee employee, double percent) {
        double newSalary = employee.getSalary() * (1 + percent / 100);
        employee.setSalary(newSalary);
    }
	
}
