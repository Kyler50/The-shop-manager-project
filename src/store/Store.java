package store;

import java.util.Iterator;

public interface Store {
	Iterator products();
	String getName();
	String getAddress();
	String getOwner();
}
