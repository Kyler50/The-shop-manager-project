package store;

import java.util.Date;

public interface LogEntry {
	Date getDate();
	String gtLogInfo();
	boolean isPurchase();
	boolean isRefill();
	boolean isProductRemove();
	boolean isGetProductList();

}
