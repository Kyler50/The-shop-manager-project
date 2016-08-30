package store;

import java.io.File;
import java.util.Iterator;

public interface Store {
	void purchase(Product p, long quantity) throws ShopException, ClosedException;
	Iterator products() throws ShopException;
	String getName();
	String getAddress();
	String getOwner();
	void unlock();
	void lock();
	File getLog() throws ShopException;
}
