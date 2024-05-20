package DemoArea;

public class ObjOfArea {
	public static void main(String[] args) {
        // Creating an object of the Area class
        Area rectangle = new Area();

        // Setting dimensions of the rectangle
        rectangle.setDim(15.0,13.0);

        // Getting and printing the area of the rectangle
        System.out.println("Area of the rectangle: " + rectangle.getArea());
    }

}
