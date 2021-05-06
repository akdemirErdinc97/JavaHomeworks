
public class DiscountManager implements DiscountService {

	//Product product;
	
	/*public DiscountManager(Product product) {
		this.product = product;
	}*/
	
	
	public double discount(Product product) {
		double price;
		price = product.price - (product.price*product.discountAmount/100);
		return price;
		
	}

}
