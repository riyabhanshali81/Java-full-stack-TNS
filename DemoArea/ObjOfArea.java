package DemoArea;
import java.util.Scanner;

public class ObjOfArea {
	public static void main(String[] args) {
        // Creating an object of the Area class
        Area rectangle = new Area();

        //Value Form User
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter First Value:");

        double f = s.nextDouble();
        
        System.out.println("Enter Secound Value:");

        double se = s.nextDouble();
        
        // Setting dimensions of the rectangle
        rectangle.setDim(f,se);

        // Getting and printing the area of the rectangle
        System.out.println("Area of the rectangle: " + rectangle.getArea());
    }

}
