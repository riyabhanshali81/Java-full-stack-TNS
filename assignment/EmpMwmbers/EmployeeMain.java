package assignment.EmpMwmbers;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// class Member
class Member {
    protected String name;
    protected int age;
    protected String phoneNumber;
    protected String address;
    protected double salary;

    //Peramiter Constructor
    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    // Method to print the salary of the member
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

// Class Employee inherits Member
class Employee extends Member {
    private String specialization;

    // Constructor
    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    // Getter for specialization
    public String getSpecialization() {
        return specialization;
    }
}

// Class Manager inherits Member
class Manager extends Member {
    private String department;

    // Constructor
    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }
}

// Main class 
public class EmployeeMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read input details for Employee
        System.out.println("Enter details for Employee:");
        System.out.print("Name: ");
        String empName = br.readLine();
        System.out.print("Age: ");
        int empAge = Integer.parseInt(br.readLine());
        System.out.print("Phone Number: ");
        String empPhoneNumber = br.readLine();
        System.out.print("Address: ");
        String empAddress = br.readLine();
        System.out.print("Salary: ");
        double empSalary = Double.parseDouble(br.readLine());
        System.out.print("Specialization: ");
        String empSpecialization = br.readLine();

        // Create an Employee object
        Employee emp = new Employee(empName, empAge, empPhoneNumber, empAddress, empSalary, empSpecialization);

        // Read input details for Manager
        System.out.println("Enter details for Manager:");
        System.out.print("Name: ");
        String mgrName = br.readLine();
        System.out.print("Age: ");
        int mgrAge = Integer.parseInt(br.readLine());
        System.out.print("Phone Number: ");
        String mgrPhoneNumber = br.readLine();
        System.out.print("Address: ");
        String mgrAddress = br.readLine();
        System.out.print("Salary: ");
        double mgrSalary = Double.parseDouble(br.readLine());
        System.out.print("Department: ");
        String mgrDepartment = br.readLine();

        // Create a Manager object
        Manager mgr = new Manager(mgrName, mgrAge, mgrPhoneNumber, mgrAddress, mgrSalary, mgrDepartment);

        // Print salary of both Employee and Manager
        System.out.println("\nEmployee Salary:");
        emp.printSalary();
        System.out.println("\nManager Salary:");
        mgr.printSalary();
    }
}





