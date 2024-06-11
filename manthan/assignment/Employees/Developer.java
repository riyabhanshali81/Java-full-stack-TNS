package manthan.assignment.Employees;

//inherit form Employee
public class Developer extends Employee {
	
	 private String programmingLanguage;

	//parameter constructor
	    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
	    	 //Employee Var
	    	super(name, employeeId, salary);
	        this.programmingLanguage = programmingLanguage;
	    }

	    public String getProgrammingLanguage() {
	        return programmingLanguage;
	    }

	    public void setProgrammingLanguage(String programmingLanguage) {
	        this.programmingLanguage = programmingLanguage;
	    }

		@Override
		public String toString() {
			return "Developer= programmingLanguage:" + programmingLanguage;
		}

}
