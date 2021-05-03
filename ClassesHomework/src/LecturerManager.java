
public class LecturerManager {

	public void addLecturer(Lecturer lecturer) {
		System.out.println(lecturer.name + " added");
	}
	
	public void listAllLecturers(Lecturer[] lecturers) {
		for(Lecturer lecturer:lecturers) {
			System.out.println(lecturer.name+" "+lecturer.skills);
		}
	}
}
