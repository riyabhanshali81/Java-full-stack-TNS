package geometry;

public class Triangle {
	
	    private double s1;
	    private double s2;
	    private double s3;

	    public Triangle(double side1, double side2, double side3) {
	        this.s1 = side1;
	        this.s2 = side2;
	        this.s3 = side3;
	    }

		public double getS1() {
			return s1;
		}

		public void setS1(double s1) {
			this.s1 = s1;
		}

		public double getS2() {
			return s2;
		}

		public void setS2(double s2) {
			this.s2 = s2;
		}

		public double getS3() {
			return s3;
		}

		public void setS3(double s3) {
			this.s3 = s3;
		}
		
		public double calculatePerimeter() {
	        return s1 + s2 + s3;
	    }
}
