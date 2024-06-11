import manthan.assignment.utilities.*;
import manthan.assignment.Employees.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AssignmentMain {

	public static void main(String[] args) {


		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        try {
	            // Reading Manager details
	            System.out.println("Enter Manager Details:");
	            System.out.print("Name: ");
	            String managerName = br.readLine();
	            System.out.print("ID: ");
	            int managerID = Integer.parseInt(br.readLine());
	            System.out.print("Salary: ");
	            double managerSalary = Double.parseDouble(br.readLine());
	            System.out.print("Department: ");
	            String managerDepartment = br.readLine();

	            // Reading Developer details
	            System.out.println("\nEnter Developer Details:");
	            System.out.print("Name: ");
	            String developerName = br.readLine();
	            System.out.print("ID: ");
	            int developerID = Integer.parseInt(br.readLine());
	            System.out.print("Salary: ");
	            double developerSalary = Double.parseDouble(br.readLine());
	            System.out.print("Programming Language: ");
	            String developerLanguage = br.readLine();

	            // Creating instances
	            Manager manager = new Manager(managerName, managerID, managerSalary, managerDepartment);
	            Developer developer = new Developer(developerName, developerID, developerSalary, developerLanguage);

		

        System.out.println("Manager Details:");
        EmployeeUtilities.displayEmployeeDetails(manager);

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.displayEmployeeDetails(developer);

        System.out.println("\nGiving a 10% raise to both employees...");

        EmployeeUtilities.giveRaise(manager, 10);
        EmployeeUtilities.giveRaise(developer, 10);

        System.out.println("\nManager Details after raise:");
        EmployeeUtilities.displayEmployeeDetails(manager);

        System.out.println("\nDeveloper Details after raise:");
        EmployeeUtilities.displayEmployeeDetails(developer);
        
	    } catch (IOException | NumberFormatException e) {
	            System.out.println("Error reading input: " + e.getMessage());
	        }
	}
}
