package store;

import java.util.Enumeration;
import java.util.Hashtable;




public class Shop {
	private String name, address, owner;
	private Hashtable<Long, ShopEntry> foodBar;
	
	public Shop(String name, String address, String owner, Hashtable<Long, ShopEntry> foodBar){
		this.name = name;
		this.address = address;
		this.owner = owner;
		this.foodBar = foodBar;
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
		for(Enumeration<ShopEntry> e = foodBar.elements();
				e.hasMoreElements();){
			ShopEntry s = e.nextElement();
			if(c.isInstance(s.getFood())&& s.getQuantity()>0)
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
	
	public void refilledFood(Long barCode, long quantity)throws NonExistentFoodException{
		ShopEntry s = (ShopEntry) foodBar.get(barCode);
		if(s == null) throw new NonExistentFoodException("Nincs ilyen �r�: "+barCode);
		s.addQuantity(quantity);
	}
	
	public void refilledNewFood(Food f, long quantity, long price){
		ShopEntry s = new ShopEntry(f, quantity, price);
				s.addQuantity(quantity);
		}
	
	public void purchaseFood(Long barCode, long quantity)throws NonExistentFoodException, TooManyDeductionsException{
		ShopEntry s = (ShopEntry) foodBar.get(barCode);
		if(s == null) throw new NonExistentFoodException("Nincs ilyen �r�: "+barCode);
		if(s != null){
			if (s.getQuantity() < quantity) throw new TooManyDeductionsException("Nincs m�r elegend� mennyis�g: "+barCode);
			s.deductQuantity(quantity);
		}
	}
	
	public void removeFood(Long barCode) throws NonExistentFoodException{
		if(foodBar.remove(barCode) == null)throw new NonExistentFoodException("Nincs ilyen �r�: "+barCode);
	}
	
	
	
	
	
	
	
	public class ShopEntry{
		private Food f;
		private long quantity;
		private long price;
		public ShopEntry(Food f, long quantity, long price){
			this.f = f;
			this.quantity = quantity;
			this.price = price;
		}
		public Food getFood(){
			return f;
		}
		public void setFood(Food f){
			this.f = f;
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
