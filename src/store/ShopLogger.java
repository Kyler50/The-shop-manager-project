package store;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;

public class ShopLogger implements Log, Logger {
	private Vector logs;
	private File f;
	
	public ShopLogger(){
		logs = new Vector();
	}
	
	public InputStream getLogStream() throws ShopException{
		if (f == null) throw new ShopException("A log nincs még lezárva!");
		try {
			return new FileInputStream(f);
		} catch (FileNotFoundException e) {
			throw new ShopException("I/O hiba!");
		}
	}
	public Iterator getPurchases() {
		Vector purchases = new Vector();
		for (int i = 0; i < logs.size(); i++) {
			LogRegistry l = (LogRegistry) logs.elementAt(i);
			if (l.isPurchase()) purchases.add(l);
		}
		return purchases.iterator();
	}
	public Iterator getRefilleds(){
		Vector purchases = new Vector();
		for (int i = 0; i < logs.size(); i++) {
			LogRegistry l = (LogRegistry) logs.elementAt(i);
			if (l.isRefill()) purchases.add(l);
		}
		return purchases.iterator();
	}
	public Iterator getProductRemove(){
		Vector purchases = new Vector();
		for (int i = 0; i < logs.size(); i++) {
			LogRegistry l = (LogRegistry) logs.elementAt(i);
			if (l.isProductRemove()) purchases.add(l);
		}
		return purchases.iterator();
	}
	public Iterator getProductList(){
		Vector purchases = new Vector();
		for (int i = 0; i < logs.size(); i++) {
			LogRegistry l = (LogRegistry) logs.elementAt(i);
			if (l.isGetProductList()) purchases.add(l);
		}
		return purchases.iterator();
	}
	public Iterator getFullLogging(){
		return logs.iterator();
	}
	public LogRegistry[] getFullLoggingAsArray(){
		return (LogRegistry[]) logs.toArray(new LogRegistry[logs.size()]);
	}
	public void addPurchase(String info){
		logs.add(new ShopLogRegistry(Logger.VASARLAS, new Date(), info));
	}
	public void addProductRefill(String info){
		logs.add(new ShopLogRegistry(Logger.FELTOLTES, new Date(), info));
	}
	public void addProductRemove(String info){
		logs.add(new ShopLogRegistry(Logger.TORLES, new Date(), info));
	}
	public void addGetProductList(String info){
		logs.add(new ShopLogRegistry(Logger.ARULISTALEKERES, new Date(), info));
	}
	public void closeLogging(){
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < logs.size(); i++) {
			ShopLogRegistry shopLogRegistry = (ShopLogRegistry) logs.elementAt(i);
			sb.append(shopLogRegistry+"");
		}try {
			f = new File("/path/log.txt");
			FileWriter w = new FileWriter(f);
			w.write(sb.toString());
			w.close();
		} catch (Exception e) {
		}
	}
	
	
	
	
	
	
	
	class ShopLogRegistry implements LogRegistry{
		private int code;
		private Date date;
		private String logInfo;
		
		public ShopLogRegistry(int code, Date date, String logInfo){
			this.code = code;
			this.date = date;
			this.logInfo = logInfo;
		}
		
		public Date getDate(){
			return date;
		}
		public String getLogInfo(){
			return logInfo;
		}
		public boolean isPurchase(){
			return code == Logger.VASARLAS;
		}
		public boolean isRefill(){
			return code == Logger.FELTOLTES;
		}
		public boolean isProductRemove(){
			return code == Logger.TORLES;
		}
		public boolean isGetProductList(){
			return code == Logger.ARULISTALEKERES;
		}
		public String toString(){
			return logInfo+" dátuma: "+date;
		}
	}
}
