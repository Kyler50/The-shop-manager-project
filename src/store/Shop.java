package store;

import java.util.Vector;

/**
 * @author Vas Richard Roland
 *
 */
public class Shop {
	private String name, address, owner;
	private Vector milkbar;
	
	public Shop(String name, String address, String owner, Vector milkbar){
		this.name = name;
		this.address = address;
		this.owner = owner;
		this.milkbar = milkbar;
	}
	public Shop(String name, String address, String owner){
		this(name, address, owner, new Vector());
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public String getOwner(){
		return owner;
	}
	public boolean haveMilk(){
		return milkbar.isEmpty();
	}
	public void purchasedMilk(Milk m){
		milkbar.add(m);
	}
	public Milk refillMilk(Milk m){
		return (Milk)milkbar.remove(milkbar.indexOf(m));
	}

}
