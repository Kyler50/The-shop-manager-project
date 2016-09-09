package store;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import milk.LongLifeMilk;
import products.Milk;

public class UnitTest {

	@Test
	public void MilkIsFineForToday() {
		Milk LongLifeMilk = new LongLifeMilk((long) 87564385, Milk.FELLITER, "Nem kapsz tejet rt.", new Date(), Milk.FELZSIROS);
		boolean excepted = true;
		boolean result = LongLifeMilk.isGood();
		assertEquals(excepted, result);
	}

}
