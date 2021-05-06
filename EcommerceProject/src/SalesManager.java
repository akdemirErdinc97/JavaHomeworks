
public class SalesManager {

	DiscountService discountService;
	Product product;
	
	public SalesManager(DiscountService discountService ,Product product) {
		this.discountService = discountService;
		this.product = product;
	}
	
	public void sellProduct(User user) {
		double price = discountService.discount(product);
		System.out.println(user.userName+" has bought this product:"+product.name+" Price="+price);
		
	}
}
