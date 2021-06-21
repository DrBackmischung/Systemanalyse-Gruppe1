package de.mathisneunzig.kino.datamodel;

import java.util.ArrayList;

public class FoodMenu {
	
	private String name;
	private ArrayList<FoodItem> items;
	
	public static final FoodMenu NORMAL() {
		FoodMenu fm = new FoodMenu("Normal");
		fm.addItem(new FoodItem("Popcorn", "Kids", new Price("Popcorn Kids Size", 2.5)));
		fm.addItem(new FoodItem("Popcorn", "S", new Price("Popcorn S Size", 3.5)));
		fm.addItem(new FoodItem("Popcorn", "M", new Price("Popcorn M Size", 4.5)));
		fm.addItem(new FoodItem("Popcorn", "L", new Price("Popcorn L Size", 6)));
		fm.addItem(new FoodItem("Nachos", "Normal", new Price("Nachos", 5)));
		return fm;
	}
	
	public FoodMenu(String name) {
		super();
		this.name = name;
		this.items = new ArrayList<>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<FoodItem> getItems() {
		return items;
	}
	public void setItems(ArrayList<FoodItem> items) {
		this.items = items;
	}
	public void addItem(FoodItem i) {
		items.add(i);
	}
	
	public void removeItem(FoodItem i) {
		items.remove(i);
	}
	
	

}
