package products;

import java.util.Date;

public class Cheese extends Food {
	private double weight;
	private double dripping;
	
	public Cheese(Long barCode, double weight, String company, Date warrant,double dripping){
		super(barCode, company, warrant);
		this.weight = weight;
		this.dripping = dripping;
	}
	
	public double getWeight(){
		return weight;
	}
	
	public double getDripping(){
		return dripping;
	}
	
	public String toString(){
		return "Vonalk�d: "+barCode+ "\n"+
				"S�ly: "+weight+ "\n"+ 
				"Gy�rt�: "+company+ "\n"+
				"Szavatoss�gi ideje: "+warrant+"\n"+
				"Zs�rtartalma: "+dripping+"\n";
	}
}
