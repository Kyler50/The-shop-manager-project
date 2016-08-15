package store;
import store.Milk;

import java.util.Date;

public class LongLifeMilk extends Milk {
	public LongLifeMilk (long barCode, double capacity, String company, String warrant, double dripping){
		super(barCode, warrant, company, capacity, dripping);
	}
}
