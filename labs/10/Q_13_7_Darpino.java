
public class Q_13_7_Darpino {

	public static void main(String[] args) {
		//call squares
		Square square1 = new Square(5);
		Square square2 = new Square(20);
		Square square3 = new Square(8);
		Square square4 = new Square(35);
		Square square5 = new Square(29);


		//test square 1
		System.out.println("Square1");
		System.out.println("Area: " + square1.getArea());
		System.out.println("Perimeter: " + square1.getPerimeter());
		System.out.println("Key: Filled = true, not filled = false: ");
		System.out.println("Filled: " + square1.isFilled());
		System.out.println("");
		if (square1.isFilled()) {

			System.out.println("How to color: " + ((Square)square1).howToColor());
			System.out.println("");
		}


		//test square 2
		System.out.println("Square 2:");
		System.out.println("Area: " + square2.getArea());
		System.out.println("Perimeter: " + square2.getPerimeter());
		System.out.println("Key: Filled = true, not filled = false: ");
		System.out.println("Filled: " + square2.isFilled());
		System.out.println("");
		if (square2.isFilled()) {

			System.out.println("How to color: " + ((Square)square2).howToColor());
			System.out.println("");
		}

		//test square 3
		System.out.println("Square 3:");
		System.out.println("Area: " + square3.getArea());
		System.out.println("Perimeter: " + square3.getPerimeter());
		System.out.println("Key: Filled = true, not filled = false: ");
		System.out.println("Filled: " + square3.isFilled());
		System.out.println("");
		if (square3.isFilled()) {

			System.out.println("How to color: " + ((Square)square3).howToColor());
			System.out.println("");
		}

		//test square 4
		System.out.println("Square 4:");
		System.out.println("Area: " + square4.getArea());
		System.out.println("Perimeter: " + square4.getPerimeter());
		System.out.println("Key: Filled = true, not filled = false: ");
		System.out.println("Filled: " + square4.isFilled());
		System.out.println("");
		if (square4.isFilled()) {

			System.out.println("How to color: " + ((Square)square4).howToColor());
			System.out.println("");
		}


		//test square 5
		System.out.println("Square 5:");
		System.out.println("Area: " + square5.getArea());
		System.out.println("Perimeter: " + square5.getPerimeter());
		System.out.println("Key: Filled = true, not filled = false: ");
		System.out.println("Filled: " + square5.isFilled());
		System.out.println("");
		if (square5.isFilled()) {

			System.out.println("How to color: " + ((Square)square5).howToColor());
			System.out.println("");
		}
	}

}



