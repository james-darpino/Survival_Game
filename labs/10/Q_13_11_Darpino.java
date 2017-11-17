
public class Q_13_11_Darpino {

	public static void main(String[] args) {


		Octagon octagon1 = new Octagon(5);
		Octagon octagon2 = (Octagon)octagon1.clone();



		System.out.println("Octagon1 is " + (octagon1.equals(octagon2) ? "" : "not ") +
				"equal to Octagon2");







	}

}
