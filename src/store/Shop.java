package store;


import java.util.Enumeration;
import java.util.Iterator;
import java.util.Hashtable;

import exception.NonExistentFoodException;
import exception.TooManyDeductionsException;
import products.Cheese;
import store.Product;
import products.Milk;




public class Shop implements Store {
	private String name, address, owner;
	private Hashtable<Long, ShopEntry> productBar;
	
	public Iterator products(){
		return productBar.values().iterator();
	}
	
	
	public Shop(String name, String address, String owner, Hashtable<Long, ShopEntry> productBar){
		this.name = name;
		this.address = address;
		this.owner = owner;
		this.productBar = productBar;
	}
	
	public Shop(String name, String address, String owner){
		this(name, address, owner, new Hashtable<Long, ShopEntry>());
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
	
	
	public boolean isThereSpecialProduct(Class<?> c){
		for(Enumeration<ShopEntry> e = productBar.elements();
				e.hasMoreElements();){
			ShopEntry s = e.nextElement();
			if(c.isInstance(s.getProduct())&& s.getQuantity()>0)
				return true;
		}
		return false;
	}
	
	public boolean isThereMilk(){
		return isThereSpecialProduct(Milk.class);
	}
	
	public boolean isThereCheese(){
		return isThereSpecialProduct(Cheese.class);
	}
	
	public void refilledFood(Long barCode, long quantity)throws ShopException{
		ShopEntry s = (ShopEntry) productBar.get(barCode);
		if(s == null) throw new NonExistentFoodException("Nincs ilyen �r�: "+barCode);
		s.addQuantity(quantity);
	}
	
	public void refilledNewFood(Product f, long quantity, long price){
		ShopEntry s = new ShopEntry(f, quantity, price);
				s.addQuantity(quantity);
		}
	
	public void purchaseFood(Long barCode, long quantity)throws ShopException{
		ShopEntry s = (ShopEntry) productBar.get(barCode);
		if(s == null) throw new NonExistentFoodException("Nincs ilyen �r�: "+barCode);
		if(s != null){
			if (s.getQuantity() < quantity) throw new TooManyDeductionsException("Nincs m�r elegend� mennyis�g: "+barCode);
			s.deductQuantity(quantity);
		}
	}
	
	public void removeFood(Long barCode) throws ShopException{
		if(productBar.remove(barCode) == null)throw new NonExistentFoodException("Nincs ilyen �r�: "+barCode);
	}
	
	
	
	
	
	
	
	public class ShopEntry{
		private Product p;
		private long quantity;
		private long price;
		public ShopEntry(Product p, long quantity, long price){
			this.p = p;
			this.quantity = quantity;
			this.price = price;
		}
		public Product getProduct(){
			return p;
		}
		public void setProduct(Product p){
			this.p = p;
		}
		public long getQuantity(){
			return quantity;
		}
		public void setQuantity(long quantity){
			this.quantity = quantity;
		}
		public void addQuantity(long quantity){
			this.quantity += quantity;
		}
		public void deductQuantity(long quantity){
			this.quantity -= quantity;
		}
		public long getPrice(){
			return price;
		}
		public void setPrice(long price){
			this.price = price;
		}
	}
}
