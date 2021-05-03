
public class StudentManager extends UserManager {


	public void addUser(Student student) {
		System.out.println(student.id+ " student added");
	}
	
	public void addMultipleUser(Student[] students) {
		for(Student student:students) {
			addUser(student);
		}
	}
	
	public void listAllStudents() {
		System.out.println("All students were listed");
	}
	
	public void getStudentInfo(Student student) {
		System.out.println(student.firstName + " "+ student.lastName);
		System.out.println(student.completedCourses);
	}
}
