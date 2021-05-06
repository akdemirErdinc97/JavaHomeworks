
public class UserCheckManager implements UserCheckService {

	@Override
	public boolean checkUser(User user) {
		if(user.phoneNumber.length()==8) {
			return true;
		}
		else {
			return false;
		}
	}

}
