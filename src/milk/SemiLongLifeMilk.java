package milk;
import java.util.Date;

import products.Milk;

public class SemiLongLifeMilk extends Milk {
	public SemiLongLifeMilk(Long barCode, int capacity, String company, Date warrant, double dripping){
		super(barCode, capacity, company, warrant, dripping);
	}
}
