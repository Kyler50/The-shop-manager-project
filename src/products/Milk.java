package products;

import java.util.Date;


public abstract class Milk extends Food {
	public static final int LITER = 1000;
	public static final int FELLITER = 500;
	public static final int POHAR = 200;
	public static final double ZSIROS = 2.8;
	public static final double FELZSIROS = 1.5; 
	 
	private int capacity = 0;
	private double dripping;
	
	
	public Milk(long barCode, int capacity, String company, Date warrant, double dripping){
		super(barCode, company, warrant);
		this.capacity = capacity;
		this.dripping = dripping;
	}

	public int getCapacity(){
		return capacity;
	}

	public double getDripping(){
		return dripping;
	}
	
	public String toString(){
		return 	"Tej"+ "\n"+
				"Vonalkód: "+barCode+ "\n"+
				"Ûrtartalma: "+capacity+ "\n"+ 
				"Gyártó: "+company+ "\n"+
				"Szavatossági ideje: "+warrant+"\n"+
				"Zsírtartalma: "+dripping+"\n";
	}
}
