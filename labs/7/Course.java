
public class Course {

	//declare data fields
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}
	// adds students 
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	//getters
	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	//method dropStudent drops a student from the course
	public void dropStudent(String Student) {
		String[] s = new String[students.length - 1];
		for (int i = 0; i < s.length; i++) {
			s[i] = students[i];

		}
		students = s;
		numberOfStudents--;
	}

	// clears all students from every course
	public void clear() {

		students = new String[1];
		numberOfStudents = 0;


	}
}



