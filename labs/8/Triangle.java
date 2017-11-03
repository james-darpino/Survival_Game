
public class Triangle extends GeometricObject {
	//declare data fields 
	double side1 = 1;
	double side2 = 1;
	double side3 = 1;

	//Constructor to create default triangle
	public Triangle() {
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}

	//Constructor to create triangle with specific values 
	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

		//sets color and determine filled or not
		setColor(color);
		setFilled(filled);
	}

	//Getters 
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	//gets area of the triangle
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt((s - side1) * (s - side2) * (s -side3));
	}

	//gets perimeter of the triangle
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	//returns a string description for the triangle 
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;

	}
}
