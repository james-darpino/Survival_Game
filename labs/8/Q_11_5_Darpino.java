import java.util.ArrayList;

public class Q_11_5_Darpino {

	public static void main(String[] args) {
			Course course1 = new Course("Software Dev 1");
			Course course2 = new Course("Discrete Math");

			course1.addStudent("Robert");
			course1.addStudent("Beth");
			course1.addStudent("Sally");

			course2.addStudent("Robert");
			course2.addStudent("Paul");

			System.out.println("Number of students in Software Dev 1: "
				+ course1.getNumberOfStudents());
			System.out.println();
			System.out.print("Number of students in Discrete Math: "
				+ course2.getNumberOfStudents());
			
			course1.dropStudent("Sally");
			
			course2.dropStudent("Robert");
	}

}
