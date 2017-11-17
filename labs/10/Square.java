
public class Square extends GeometricObject implements Colorable {

	private double side = 0;

	public Square() {

	}

	public double getSide() {
		return side;
	}

	public Square(double side ) {
		this.side = side;
	}

	public Square(double side, String color, boolean filled ) {
		super(color,filled);
		this.side = side;
	}



	@Override
	public double getArea() {

		return side * side;
	}

	@Override
	public double getPerimeter() {

		return side * 4;
	}

	public String howToColor() {
		return "Color all four sides";
	}



}


