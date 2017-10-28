
public class Q_10_9_Darpino {
	public static void main(String[] args) {
		// Create a course
		Course course1 = new Course("Course name");
		//test add student
		course1.addStudent("Peter");
		course1.addStudent("Kim");
		course1.addStudent("Anne");
		//test number of students
		System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
		System.out.print("Students in course1 are: ");
		String[] students = course1.getStudents();

		for( int i = 0; i < course1.getNumberOfStudents(); i++) {

			//test the names of the students
			System.out.print("" + students[i] + ", ");
		}
		//test drop student
		System.out.println(" ");
		course1.dropStudent("Anne");

		System.out.println(" ");
		System.out.println("Anne dropped course1");
		System.out.println(" ");

		//test drop student
		System.out.print("The remaining Students in course1 are: ");
		for (int i = 0; i < course1.getNumberOfStudents(); i++) {
			System.out.print(students[i] + " ");
		}

	}
}