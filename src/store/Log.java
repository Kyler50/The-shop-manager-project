package store;

import java.io.InputStream;
import java.util.Iterator;

public interface Log {
	InputStream getLogStream();
	Iterator getCustomer();
	Iterator getRefilleds();
	Iterator getProductRemove();
	Iterator getProductList();
	Iterator getFullLogging();
	LogEntry[] getFullLoggingAsArray();
	

}
