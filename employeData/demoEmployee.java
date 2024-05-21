package employeData;

public class demoEmployee {
	public static void main(String[] args) {
		//obj of empinfo
		emplyoePersonalInfo emp = new emplyoePersonalInfo();
		System.out.println(emp);// call defult constructor 
		
		emp.setEname("Riya");
		emp.setEmail("Riya@gmail.com");
		emp.setAdd("Ahmedabad");
		emp.setPhoneNumber(1234567898);
		
		System.out.println(emp); // with the help of tostring fun in empinfo
	}
}
