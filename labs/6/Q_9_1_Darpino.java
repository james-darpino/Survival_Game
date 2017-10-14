
public class Q_9_1_Darpino {

	public static void main(String[] args) {
		//call the Rectangle class
		Rectangle rectangle1 = new Rectangle(4,40);

		Rectangle rectangle2 = new Rectangle(3.5,35.9);

		//call the getArea method from the rectangle class
		double area1 = rectangle1.getArea();

		double area2 = rectangle2.getArea();

		//call the getPerimeter method from the rectangle class
		double perimeter1 = rectangle1.getPerimeter();

		double perimeter2 = rectangle2.getPerimeter();

		//display the results 
		System.out.println("The area of  rectangle 1 is: " + area1 + " ");

		System.out.println("The area of rectangle 2 is: " + area2 + " ");

		System.out.println("The perimeter of rectangle 1 is: " + perimeter1 + " ");

		System.out.println("The area of rectangle 2 is: " + perimeter2 + " ");
	}

}
