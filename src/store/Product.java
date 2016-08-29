package store;

public class Product {
	protected Long barCode;
	protected String company;
	
	public Product(Long barCode, String company){
		this.barCode = barCode;
		this.company = company;
	}
	public Long getBarCode(){
		return barCode;
	}
	public String getCompany(){
		return company;
	}
}
