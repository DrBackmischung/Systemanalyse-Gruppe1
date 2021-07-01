package de.mathisneunzig.kino.datamodel;

import java.util.ArrayList;

public class PriceTable {
	
	public static final PriceTable NORMAL() {
		PriceTable pt = new PriceTable("Normal");
		pt.addPrice(new Price("Normal", 7.5));
		pt.addPrice(new Price("Normal 3D", 9.5));
		pt.addPrice(new Price("Child", 5.5));
		pt.addPrice(new Price("Child 3D", 7.5));
		pt.addPrice(new Price("Student", 6.5));
		pt.addPrice(new Price("Student 3D", 8.5));
		return pt;
	}
	
	private String name;
	private ArrayList<Price> prices;
	public PriceTable(String name) {
		super();
		this.name = name;
		this.prices = new ArrayList<>();
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public ArrayList<Price> getPrices() {
//		return prices;
//	}
//	public void setPrices(ArrayList<Price> prices) {
//		this.prices = prices;
//	}
	
	public void addPrice(Price p) {
		prices.add(p);
	}
	
	public void removePrice(Price p) {
		prices.remove(p);
	}
	
}
