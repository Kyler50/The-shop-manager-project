package products;

import java.util.Date;

public abstract class Food {
	protected Date warrant;

	public Food(long barCode, String company, Date warrant) {
		this.warrant = warrant;
	}
	
	public Date getWarrant() {
		return warrant;
	}

	public boolean isGood() {
		return warrant.before(new Date());
	}
}
