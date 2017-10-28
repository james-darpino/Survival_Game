
public class Circle2D {
	//declare data fields 
	private double x; 
	private double y; 
	private double radius;


	//getters
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getRadius() {
		return radius;
	}

	//no arg constructor 
	public Circle2D(){
		x = 0;
		y = 0;
		radius = 1;
	}
	//arg constructor
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}


	//area of the circle
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	//perimeter of the circle
	public double getPerimeter() {
		return Math.PI * (radius * 2);
	}

	// method contains to see if a specified point x,y is inside this circle
	public boolean contains(double x, double y) {


		return true;

	}
	// method contains to see if a specified point x,y is inside this circle
	public boolean contains(Circle2D circle) {



		return true;

	}
	// method overlap to check if the 2 circles overlap
	public boolean overlaps(Circle2D circle) {



		return true;
	}
}






