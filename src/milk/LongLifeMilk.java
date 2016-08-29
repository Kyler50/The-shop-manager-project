package milk;
import java.util.Date;

import products.Milk;

public class LongLifeMilk extends Milk {
	public LongLifeMilk (Long barCode, int capacity, String company, Date warrant, double dripping){
		super(barCode, capacity, company, warrant, dripping);
	}
}
