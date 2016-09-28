package store;

import java.io.InputStream;
import java.util.Iterator;

public interface Log {
	InputStream getLogStream() throws ShopException;
	Iterator getPurchases();
	Iterator getRefilleds();
	Iterator getProductRemove();
	Iterator getProductList();
	Iterator getFullLogging();
	LogRegistry[] getFullLoggingAsArray();
	

}
