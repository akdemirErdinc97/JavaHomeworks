
public class Student extends User {

	String completedCourses;
	int attendance;
	
	public Student(int id,String firstName,String lastName,String completedCourses,int attendance) {
		super(id, firstName, lastName);
		this.completedCourses = completedCourses;
		this.attendance = attendance;
	}
}
