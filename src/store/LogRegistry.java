package store;

import java.util.Date;

public interface LogRegistry {
	Date getDate();
	String getLogInfo();
	boolean isPurchase();
	boolean isRefill();
	boolean isProductRemove();
	boolean isGetProductList();

}
