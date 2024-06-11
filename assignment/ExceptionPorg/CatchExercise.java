package assignment.ExceptionPorg;

//main class
public class CatchExercise {

	 public static void main(String[] args) {
	        try {
	            // Initialize array
	            int[] a = new int[5];
	            a[5] = 30 / 5; // This line can cause ArrayIndexOutOfBoundsException and ArithmeticException

	        } catch (ArithmeticException e) {
	            System.out.println("ArithmeticException: Division by zero is not allowed.");
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBoundsException: Attempt to access an invalid array index.");
	        }
	    }
	
}
