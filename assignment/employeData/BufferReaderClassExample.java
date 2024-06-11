package assignment.employeData;
import java.io.BufferedReader;
import java.io.*;
public class BufferReaderClassExample {
	
	public static void main(String[] args) {
		
		try {
			String name;
			int salary;
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 
			 System.out.println("Enter name");
			 
			 name= br.readLine();
			 
			 System.out.println("Enter Salary");
			 
			 salary = Integer.parseInt(br.readLine());
			 
			 System.out.println("Name Is: "+name+" Salary Is: "+salary);
			
		} catch(Exception e) {
			System.out.println("Error");
		}
		
	}
	
}
