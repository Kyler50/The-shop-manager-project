package store;

import java.util.Date;

import milk.LongLifeMilk;
import milk.SemiLongLifeMilk;
import products.Cheese;
import products.Milk;


public abstract class MilkFactory {
	public static void main(String[] args) {
		Milk LongLifeMilk = new LongLifeMilk((long) 87564385, Milk.FELLITER, "Nem kapsz tejet rt.", new Date(), Milk.FELZSIROS);
		System.out.println(LongLifeMilk);
		System.out.println(LongLifeMilk.isGood());
		
		Milk SemiLongLifeMilk = new SemiLongLifeMilk((long) 75453156, Milk.LITER, "Milkaboci zrt.", new Date(), Milk.ZSIROS);
		System.out.println(SemiLongLifeMilk);
		System.out.println(SemiLongLifeMilk.isGood());
		
		Cheese Cheese = new Cheese((long) 75453156, 1.7, "Fincsa sajt kft.", new Date(), Milk.FELZSIROS);
		System.out.println(Cheese);
	}
}
