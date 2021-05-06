
public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.id = 1200;
		user1.userName = "akdemirerdinc1";
		user1.password = "12345";
		user1.email = "erdinc@yahoo.com";
		user1.phoneNumber = "12345678";
		user1.balance = 0;
		
		UserManager userManager = new UserManager(new UserCheckManager());
		userManager.createAccount(user1);
		
		Product product1 = new Product();
		product1.id = 101;
		product1.name = "Lenovo L14";
		product1.price = 10000;
		product1.discountAmount = 20;
		
		SalesManager salesManager = new SalesManager(new DiscountManager(), product1);
		salesManager.sellProduct(user1);

	}

}
