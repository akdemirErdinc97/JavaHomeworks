
public class Instructor extends User {

	String educationDetails;
	
	public Instructor(int id,String firstName,String lastName,String educationDetails) {
		super(id,firstName,lastName);
		this.educationDetails =educationDetails;
	}
}
