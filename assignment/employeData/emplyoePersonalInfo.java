package assignment.employeData;

public class emplyoePersonalInfo {

	private String name,email,add;
	private int phoneNumber;
	
	//Defualt constructor
	public emplyoePersonalInfo() {
		name = "Defult";
		email = "none";
	}
	
	//We can also use private That Don't allow to create obj of peramiter Constructor 
	//peramitter Constructor
	public emplyoePersonalInfo(String name,String email,String add,int phoneNumber) {
		this.name = name;
		this.email = email;
		this.add = add;
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}
	
	//All set method Use to access private public or protected var.
	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setEname(String ename) {
		name = ename;
	}
	
	public void getEname() {
		System.out.println("Ename Is:"+name);
	}
	
	//use to print all data easily it convert into string.
	@Override
	public String toString() {
		return "emplyoePersonalInfo [name=" + name + ", email=" + email + ", add=" + add + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
}
