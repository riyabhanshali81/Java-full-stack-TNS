package employeData;

public class demoEmployee {
	public static void main(String[] args) {
		//obj of empinfo
		emplyoePersonalInfo emp = new emplyoePersonalInfo();
		
		emp.setEname("manthan");
		emp.setEmail("manthan123@gmail.com");
		emp.setAdd("Ahmedabad");
		emp.setPhoneNumber(1234567898);
		
		System.out.println(emp); // with the help of tostring fun in empinfo
	}
}
