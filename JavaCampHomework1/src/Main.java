
public class Main {

	public static void main(String[] args) {
		
		
		Lecturer lecturer1=new Lecturer(11, "Engin Demiroğ",".Net , Java");
		Lecturer lecturer2=new Lecturer(11, "Musa Kara","Linux , Kotlin");
		Course course1=new Course(101, 25, "Java Programming", "Programming",lecturer1);
		Course course2=new Course(102, 10, "Linux", "OS",lecturer2);
		
		Course[] kurslar= {course1,course2};
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		courseManager.listAllCourses(kurslar);
		

	}

}
