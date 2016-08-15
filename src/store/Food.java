package store;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Food {
	private long barCode;
	private String company;
	private LocalDate warrant;

	public Food(long barcode, String company, String warrant) {
		this.barCode = barcode;
		this.company = company;
		setWarrant(warrant);
	}

	public long getBarCode() {
		return barCode;
	}

	public String getCompany() {
		return company;
	}

	public LocalDate getWarrant() {
		return warrant;
	}

	private void setWarrant(String warrant) {
		LocalDate date = LocalDate.parse(warrant, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		this.warrant = date;
	}

	public boolean isGood() {
		LocalDate currentDate = LocalDate.now();
		return this.warrant.compareTo(currentDate) > 0;
	}


	public String toString() {
		return "Vonalkód:" + getBarCode() + "Gyártó:" + getCompany() + "Szavatossági ideje:" + getWarrant();
	}
}
