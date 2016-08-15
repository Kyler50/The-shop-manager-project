package store;

import java.util.Hashtable;
import java.util.Vector;

import store.Shop.ShopRegistration;

/**
 * @author Vas Richard Roland
 *
 */
public class Shop {
	private String name, address, owner;
	private Hashtable<Long, ShopRegistration> milkbar;
	
	public Shop(String name, String address, String owner, Hashtable<Long, ShopRegistration> milkbar){
		this.name = name;
		this.address = address;
		this.owner = owner;
		this.milkbar = milkbar;
	}
	
	
	public Shop(String name, String address, String owner){
		return;
	}
	public Hashtable<Long, ShopRegistration> getMilkBar() {
			return milkbar;
	}
	public boolean isThereFood(Long barcode) {
			if (getMilkBar().size() == 0 || !getMilkBar().containsKey(barcode)
					|| getMilkBar().get(barcode).getQuantity() == 0) {
		  			return false;
		  		}
		  		return true;
		  	}
	public void addNewMilk(Milk milk, int quantity, int price) {
		getMilkBar().put(milk.getBarCode(), new ShopRegistration(milk, quantity, price));
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
