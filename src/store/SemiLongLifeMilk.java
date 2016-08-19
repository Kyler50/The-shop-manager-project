package store;
import store.Milk;

import java.util.Date;

public class SemiLongLifeMilk extends Milk {
	public SemiLongLifeMilk(long barCode, int capacity, String company, Date warrant, double dripping){
		super(barCode, capacity, company, warrant, dripping);
	}
}
