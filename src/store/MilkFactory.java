package store;

import java.util.Date;

import milk.LongLifeMilk;
import milk.SemiLongLifeMilk;
import products.Cheese;
import products.Milk;
import products.Soap;


public class MilkFactory {
	
	public static Milk newLongLifeMilk(Long barCode, int capacity, String company, Date warrant, double dripping){
		return new LongLifeMilk(barCode, capacity, company, warrant, dripping);
	}
	public static Milk newSemmiSkimmedLongLifeMilk(Long barCode, int capacity, String company, Date warrant){
		return new LongLifeMilk(barCode, capacity, company, warrant, Milk.FELZSIROS);
	}
	public static Milk newSemmiSkimmedLiterLongLifeMilk(Long barCode, int capacity, String company, Date warrant){
		return new LongLifeMilk(barCode, capacity, company, warrant, Milk.FELZSIROS);
	}
	
	
	public static void main(String[] args) {
		Milk LongLifeMilk = new LongLifeMilk((long) 87564385, Milk.FELLITER, "Nem kapsz tejet rt.", new Date(), Milk.FELZSIROS);
		System.out.println(LongLifeMilk);
		System.out.println(LongLifeMilk.isGood());
		
		Milk SemiLongLifeMilk = new SemiLongLifeMilk((long) 75453156, Milk.LITER, "Milkaboci zrt.", new Date(), Milk.ZSIROS);
		System.out.println(SemiLongLifeMilk);
		System.out.println(SemiLongLifeMilk.isGood());
		
		Cheese Cheese = new Cheese((long) 75453156, 1.7, "Fincsa sajt kft.", new Date(), Milk.FELZSIROS);
		System.out.println(Cheese);
		
		Soap soap = new Soap((long)12345678, "Fürödj meg szépen zrt.", Soap.AMOSOHATAS);
		System.out.println(soap);
	}
}
