
public class InstructorManager extends UserManager {
	
	public void addUser(Instructor instructor) {
		System.out.println(instructor.id + " instructor added");
	}
	
	public void addMultipleUser(Instructor[] instructors) {
		for(Instructor instructor:instructors) {
			addUser(instructor);
		}
	}
	
	public void listAllInstructors() {
		System.out.println("All instructors were listed");
	}
	
	public void getInstructorInfo(Instructor instructor) {
		System.out.println(instructor.firstName + " "+ instructor.lastName);
		System.out.println(instructor.educationDetails);
	}

}
