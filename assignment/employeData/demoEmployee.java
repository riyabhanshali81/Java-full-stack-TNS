package assignment.employeData;

public class demoEmployee {
	public static void main(String[] args) {
		//obj of empinfo
		emplyoePersonalInfo emp = new emplyoePersonalInfo();
		System.out.println("Defualt Constructor "+emp);// call defult constructor 
		
		System.out.println();
		
		emp.setEname("Manthan");
		emp.setEmail("Manthan123@gmail.com");
		emp.setAdd("Ahmedabad");
		emp.setPhoneNumber(1234567898);
		
		System.out.println("Static Value "+emp); // with the help of tostring fun in empinfo
	
		System.out.println();
		
		emplyoePersonalInfo empPeramiter = new emplyoePersonalInfo("Manthan","Mnathan123@gmail.com","gj",12322323);
		System.out.println("Peramiter Constructor "+empPeramiter);
	}
}
