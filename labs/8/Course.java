import java.util.ArrayList;


public class Course {

	private String courseName;
	ArrayList<String> students = new ArrayList<>();


	public Course(String courseName) {
		this.courseName = courseName;
		students = new ArrayList<String>();
	}

	public void setStudents(ArrayList<String> students) {
		this.students = students;
	}

	public void addStudent(String student) {
		students.add(student);
	}

	public ArrayList<String> getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return students.size();
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {
		students.remove(student);
	}
}
