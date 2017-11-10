
public class IllegalTriangleException extends Exception{
	//declare data fields
	private double side1;
	private double side2;
	private double side3;

	//no arg constructor for a default illegal triangle
	public IllegalTriangleException() {
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}

	//constructor with arg 
	public IllegalTriangleException(double side1, double side2, double side3) {
		super(); //calls parent class
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}



	public double getSide2() {
		return side2;
	}


	public double getSide3() {
		return side3;
	}


}
