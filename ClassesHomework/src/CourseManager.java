
public class CourseManager {
	
	public void addCourse(Course course) {
		System.out.println(course.name +" course added.");
	}
	
	public void listAllCourses(Course[] courses) {
		for(Course course:courses) {
			System.out.println(course.name+" "+course.lecturer.name);
		}
	}

}
