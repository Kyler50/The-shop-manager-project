package products;

import java.util.Date;

import store.Product;

public abstract class Food extends Product {
	protected Date warrant;

	public Food(Long barCode, String company, Date warrant) {
		super(barCode, company);
		this.warrant = warrant;
	}
	
	public Date getWarrant() {
		return warrant;
	}

	public boolean isGood() {
		return warrant.before(new Date());
	}
}
