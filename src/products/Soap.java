package products;

import store.Product;

public class Soap extends Product {
	public static final char AMOSOHATAS = 'A';
	 public static final char BMOSOHATAS = 'B';
	 private final char wash;

	 public Soap(Long barCode, String company, char wash ){
		 super(barCode, company);
		 this.wash = wash;
	 }
}
