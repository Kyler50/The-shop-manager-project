package store;
import store.Milk;

import java.util.Date;

public class SemiLongLifeMilk extends Milk {
	public SemiLongLifeMilk(long barCode, double capacity, String company, String warrant, double dripping){
		super(barCode, warrant, company, capacity, dripping);
	}
}
