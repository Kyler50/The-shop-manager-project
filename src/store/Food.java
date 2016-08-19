package store;

import java.util.Date;

public abstract class Food {
	protected Long barCode;
	protected String company;
	protected Date warrant;

	public Food(long barCode, String company, Date warrant) {
		this.barCode = barCode;
		this.company = company;
		this.warrant = warrant;
	}

	public Long getBarCode() {
		return barCode;
	}

	public String getCompany() {
		return company;
	}

	public Date getWarrant() {
		return warrant;
	}

	public boolean isGood() {
		return warrant.before(new Date());
	}


	public String toString() {
		return "Vonalkód:" + barCode + "Gyártó:" + company + "Szavatossági ideje:" + warrant;
	}
}
