package store;

import java.util.Date;

public class Runner {
	public static void main(String[] args) {
		

		MilkFactory mFactory = new MilkFactory();
			Shop mShop = new Shop("Milk Shop", "Szentmihályi út 27.", "Vas Richárd");
	
			Milk milk1 = mFactory.makeNewSemiLongLifeMilk("Milk", "2016-12-20", 1230, 2.5);
			Milk milk2 = mFactory.makeNewSemiLongLifeMilk("Tej", "2016-12-24", 230, 2.0);
	
			mShop.addNewMilk(milk1, 15, 250);
			mShop.addNewMilk(milk2, 25, 300);
	
			printMilkShop(mShop);
}
	private static void printMilkShop(Shop milkShop) {
		System.out.println("SHOP:\n\t" + milkShop + "tPRODUCTS:");
			printMilkShop(milkShop.getMilkBar());
		  	}
}
