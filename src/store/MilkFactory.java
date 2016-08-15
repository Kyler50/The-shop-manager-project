package store;

import java.util.UUID;
import store.LongLifeMilk;
import store.SemiLongLifeMilk;

public class MilkFactory {
	private static long generateID(){
	UUID id = UUID.randomUUID();
	return Math.abs(id.getMostSignificantBits());
}



	public LongLifeMilk makeNewLongLifeMilk(String company, String warrant, double capacity, double dripping) {
			LongLifeMilk llMilk = new LongLifeMilk(generateID(), capacity, warrant, company, dripping);
			return llMilk;
		}
	
		public SemiLongLifeMilk makeNewSemiLongLifeMilk(String company, String warrant, double capacity, double dripping) {
			SemiLongLifeMilk sllMilk = new SemiLongLifeMilk(generateID(), capacity, warrant, company, dripping);
			return sllMilk;
		}
		public Cheese makeNewCheese(String company, String warrant, double weight, double dripping) {
				Cheese cheese = new Cheese(generateId(), company, warrant, weight, dripping);
				return cheese;
}
