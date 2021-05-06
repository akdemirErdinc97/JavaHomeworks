
public class UserManager implements UserService {
	
	UserCheckService userCheckService;
	
	 public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void createAccount(User user) {
		if(this.userCheckService.checkUser(user)) {
			System.out.println("user id="+user.id+" account created");
		}
		else {
			System.out.println("Person is not valid.Create failed");
		}
		
		
	}

	@Override
	public void updateUserInfo(User user) {
		System.out.println("user updated");
		
	}

	@Override
	public void deleteAccount(User user) {
		System.out.println("account deleted");
		
	}

}
