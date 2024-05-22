package StudentsList;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class student {
	
	public static void main(String[] args) {
		
		//Create obj With No Name And No other Details
		studentInfo stu = new studentInfo();

		System.out.println("When name is not define....");
		System.out.println();
		
		System.out.println(stu);
		System.out.println();
		
		System.out.println("When name is define....");
		System.out.println();
		
		try {
			String name;
			int rollno;
			String city;
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 
			 System.out.println("Enter Roll NO: ");
			 
			 rollno = Integer.parseInt(br.readLine());
			 
			 System.out.println("Enter Name: ");
			 
			 name = br.readLine();
			 System.out.println();
			 
			 System.out.println("Enter City: ");
			 
			 city = br.readLine();
			 System.out.println();
			 
			//Create obj which has name or other Details
			studentInfo stu2 = new studentInfo(rollno,name,city);
			 
			 System.out.println(stu2);
			
		} catch(Exception e) {
			System.out.println("Error To Get Value....");
		}
		
		
	}
	
}
