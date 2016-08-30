package store;

public interface Logger {
	static final int FELTOLTES = 1;
	static final int TORLES = 1;
	static final int VASARLAS = 1;
	static final int ARULISTALEKERES = 1;
	
	void addPurchase(String info);
	void addProductRefill(String info);
	void addProductRemove(String info);
	void addGetProductList(String info);
	void closeLogging();

}
