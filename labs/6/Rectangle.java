

public class Rectangle {

	//the width of a rectangle 
	double width = 1;

	//the height of a rectangle 
	double height = 1;

	//no-arg constructor that creates a default rectangle with height and width = 1
	public Rectangle () {    


		width = 1;

		height = 1;


	}

	// constructor that creates a rectangle with a specified width and height 
	public Rectangle ( double w, double h) {


		width = w;

		height = h;

	}
	// method to get the area of the rectangle (L * W)
	public double getArea() {

		//the area of a rectangle 
		double area = width * height;

		//return area
		return area;

	}

	// method to get the perimeter of the rectangle 2(L * W)
	public  double getPerimeter() {

		//the perimeter of a rectangle 
		double perimeter = 2.0 *(width * height);

		//return perimeter
		return perimeter;
	}
}
