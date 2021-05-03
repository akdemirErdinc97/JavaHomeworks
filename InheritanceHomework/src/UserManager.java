
public class UserManager {

	public void addUser(User user) {
		System.out.println("User added");
	}

	public void addMultipleUser(User[] users) {
		for(User user:users) {
			addUser(user);
		}
	}
	
	public void listAllUsers() {
		System.out.println("All users were listed");
	}
}
