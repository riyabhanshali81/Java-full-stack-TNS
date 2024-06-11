// Class definition for Rectangle
class Rectangle {
	
    protected double length;
    protected double breadth;

    //perimeter Constructor
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to print area of the rectangle
    public void printArea() {
        double area = length * breadth;
        System.out.println("Area of the rectangle: " + area);
    }

    // Method to print perimeter of the rectangle
    public void printPerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}

// Class definition for Square
class Square extends Rectangle {
    
    // Constructor
    public Square(double side) {
        // Calling the constructor of the parent class with the same side for both length and breadth
        super(side, side);
    }

    // Overriding the method to print area of the square
    @Override
    public void printArea() {
        double area = length * length;  // Since it's a square, both length and breadth are same
        System.out.println("Area of the square: " + area);
    }

    // Overriding the method to print perimeter of the square
    @Override
    public void printPerimeter() {
        double perimeter = 4 * length;  // Since it's a square, both length and breadth are same
        System.out.println("Perimeter of the square: " + perimeter);
    }
}

// Main class 
public class RectangleMain {
    public static void main(String[] args) {
        // Create a Rectangle object and print its area and perimeter
        Rectangle rect = new Rectangle(5, 10);
        rect.printArea();
        rect.printPerimeter();

        // Create a Square object and print its area and perimeter
        Square sq = new Square(7);
        sq.printArea();
        sq.printPerimeter();
    }
}
