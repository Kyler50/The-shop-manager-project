package store;

import java.util.Date;

/**
 * @author Vas Richard Roland
 *
 */
public class Milk {
	private long barCode;
	private int capacity = 0;
	private String company;
	private Date warrant;
	private double dripping;

	public Milk(long barCode, int capacity, String company, Date warrant, double dripping) {
		this.barCode = barCode;
		this.capacity = capacity;
		this.company = company;
		this.warrant = warrant;
		this.dripping = dripping;
	}
	public long getBarCode(){
		return barCode;
	}
	public boolean isGood(){
		return warrant.before( new Date());
	}
	public int getCapacity(){
		return capacity;
	}
	public String getCompany(){
		return company;
	}
	public Date getWarrant(){
		return warrant;
	}
	public double getDripping(){
		return dripping;
	}
	}
	public static void main(String[] args) {
	Milk m = new Milk(1300, "Alföldi Tej Kft.", new Date(), 1.5);
	System.out.println(m);
	}
	public String toString(){
		return "Ûrtartalma: "+capacity+" Gyártó: "+company+" Szavatossági ideje: "+warrant+" Zsírtartalma: "+dripping+" Ára: "+price+"Ft";
	}
}
