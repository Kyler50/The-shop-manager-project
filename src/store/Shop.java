package store;

/**
 * @author Vas Richard Roland
 *
 */
public class Shop {
	private String name, address, owner;
	private Milk[] milkbar;
	private int flag;
	
	public Shop(String name, String address, String owner, Milk[] milkbar, int flag){
		this.name = name;
		this.address = address;
		this.owner = owner;
		this.milkbar = milkbar;
		flag=milkbar.length-1;
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
		return flag>=0;
	}
	public Milk purchasedMilk(Milk m){
		return milkbar[flag--];
	}

}
