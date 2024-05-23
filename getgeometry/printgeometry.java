package getgeometry;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import geometry.*;

public class printgeometry {

	    public static void main(String[] args) {
	        
	    	try {
	    		
	    		double c;
	    		double r1,r2;
	    		double t1,t2,t3;
	    			
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				 
				 System.out.println("Enter Circle: ");
				 
				 c = Double.parseDouble(br.readLine());
				 
				 System.out.println();
				 System.out.println("Enter Rectangle R1: ");
				 
				 r1 = Double.parseDouble(br.readLine());
				 System.out.println();
				 
				 System.out.println("Enter Rectangle R2: ");
				 r2 = Double.parseDouble(br.readLine());
				 System.out.println();
				
				 
				 System.out.println("Enter Triangle t1: ");
				 
				 t1 = Double.parseDouble(br.readLine());
				 System.out.println();
				 
				 System.out.println("Enter Triangle t2: ");
				 t2 = Double.parseDouble(br.readLine());
				 System.out.println();
				 
				 System.out.println("Enter Triangle t3: ");
				 t3 = Double.parseDouble(br.readLine());
				 System.out.println();
				 
				 
	    		Circle circle = new Circle(c);//5
	 	        Rectangle rectangle = new Rectangle(r1, r2);//4,6
	 	        Triangle triangle = new Triangle(t1, t2, t3);//3,4,5
	 	        
	 	       // Print data
		        System.out.println("Circle Is:");
		        System.out.println("Area: " + circle.calculateArea());
		        System.out.println("Perimeter: " + circle.calculatePerimeter());

		        System.out.println("\nRectangle Is:");
		        System.out.println("Area: " + rectangle.calculateArea());
		        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

		        System.out.println("\nTriangle Is:");
		        System.out.println("Perimeter: " + triangle.calculatePerimeter());
				
			} catch(Exception e) {
				System.out.println("Error To Get Value....");
			}
	    }
	}

