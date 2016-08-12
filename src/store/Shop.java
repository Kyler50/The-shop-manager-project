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
		ShopRegistration r = (ShopRegistration)milkbar.get(barCode);
		if (r != null){
			r.deductQuantity(1);
			return r.getMilk();
		}
		return null;
	}
	public void refillMilk(Milk m){
		ShopRegistration r = (ShopRegistration)milkbar.get(m.getBarCode());
		if (r == null){
			r = new ShopRegistration(m, 1, 13);
			milkbar.put(m.getBarCode(), r);
		}
		else r.addQuantity(1);
	}
	
	
	
	class ShopRegistration{
		private Milk m;
		private int quantity;
		private int price;
		public ShopRegistration(Milk m, int quantity, int price){
			this.m = m;
			this.quantity = quantity;
			this.price = price;
		}
		public Milk getMilk(){
			return m;
		}
		public void setMilk(Milk m){
			this.m = m;
		}
		public int getQuantity(){
			return quantity;
		}
		public void setQuantity(int quantity){
			this.quantity = quantity;
		}
		public void addQuantity(int quantity){
			this.quantity += quantity;
		}
		public void deductQuantity(int quantity){
			this.quantity -= quantity;
		}
		public int getPrice(){
			return price;
		}
		public void setPrice(int price){
			this.price = price;
		}
	}
}
