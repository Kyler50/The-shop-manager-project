package store;
import store.Milk;

import java.util.Date;

public class LongLifeMilk extends Milk {
	public LongLifeMilk (long barCode, int capacity, String company, Date warrant, double dripping){
		super(barCode, capacity, company, warrant, dripping);
	}
}
