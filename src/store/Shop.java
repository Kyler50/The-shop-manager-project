package store;

import java.util.Hashtable;
import java.util.Vector;

/**
 * @author Vas Richard Roland
 *
 */
public class Shop {
	private String name, address, owner;
	private Hashtable milkbar;
	
	public Shop(String name, String address, String owner, Hashtable milkbar){
		this.name = name;
		this.address = address;
		this.owner = owner;
		this.milkbar = milkbar;
	}
	public Shop(String name, String address, String owner){
		this(name, address, owner, new Hashtable());
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
	public Milk purchasedMilk(long barCode){
		return (Milk)milkbar.remove(milkbar.get(new Long(barCode)));
	}
	public void refillMilk(Milk m){
		milkbar.put(new Long(m.getBarCode()), m);
	}

}
