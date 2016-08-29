package store;

import java.util.Date;

import milk.LongLifeMilk;
import milk.SemiLongLifeMilk;
import products.Milk;


public abstract class MilkFactory {
	public static void main(String[] args) {
		Milk LongLifeMilk = new LongLifeMilk(87564385, Milk.FELLITER, "Nem kapsz tejet rt.", new Date(), Milk.FELZSIROS);
		System.out.println(LongLifeMilk);
		System.out.println(LongLifeMilk.isGood());
		
		Milk SemiLongLifeMilk = new SemiLongLifeMilk(75453156, Milk.LITER, "Milkaboci zrt.", new Date(), Milk.ZSIROS);
		System.out.println(SemiLongLifeMilk);
		System.out.println(SemiLongLifeMilk.isGood());
	}
}
