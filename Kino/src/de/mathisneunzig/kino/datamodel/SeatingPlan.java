package de.mathisneunzig.kino.datamodel;

import java.util.ArrayList;

public class SeatingPlan {
	
	private String name;
	private ArrayList<Character[]> seatPlan;
	public SeatingPlan(String name) {
		super();
		this.name = name;
		this.seatPlan = new ArrayList<>();
	}
	
	public static final SeatingPlan NORMAL() {
		SeatingPlan s = new SeatingPlan("Normal");
		Character[] c = {'N', 'N', 'N', 'N', 'D'};
		s.addRow(c);
		return s;
	}
	
	public void addRow(Character[] row) {
		seatPlan.add(row);
	}
	
	public void removeRow(int index) {
		seatPlan.remove(index);
	}
	
}
