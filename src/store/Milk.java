package store;

import java.util.Date;

/**
 * @author Vas Richard Roland
 *
 */
public abstract class Milk {
	public static final int LITER = 1000;
	public static final int FELLITER = 500;
	public static final int POHAR = 200;
	public static final double ZSIROS = 2.8;
	public static final double FELZSIROS = 1.5;
	
	private double capacity;
	private double dripping;

	public Milk(long barCode, String company, String warrant, double capacity, double dripping) {
		super(barCode, company, warrant);
		setCapacity(capacity);
		setDripping(dripping);
	}

	public double getCapacity() {
		return capacity;
	}

	private void setCapacity(double capacity) {
		if (capacity == 1000) {
		this.capacity = LITER;
		} else if (capacity < 1000 && capacity == 500 ) {
			this.capacity = FELLITER;
		} else {
			this.capacity = POHAR;
		}
	}

	public double getDripping() {
		return dripping;
	}

	private void setDripping(double dripping) {
		if (dripping > 2.8) {
			this.dripping = ZSIROS;
		} else {
			this.dripping = FELZSIROS;
		}
	}
	
	public String toString(){
		return "Vonalkód: "+getBarCode()+" Ûrtartalma: "+capacity+" Gyártó: "+company+" Szavatossági ideje: "+warrant+" Zsírtartalma: "+dripping;
	}
}
