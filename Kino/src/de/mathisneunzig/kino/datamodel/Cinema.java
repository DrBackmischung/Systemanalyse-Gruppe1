package de.mathisneunzig.kino.datamodel;

import java.util.ArrayList;

public class Cinema {
	
	private String name;
	private String adress;
	private long phoneNr;
	private ArrayList<Employee> employees;
	private ArrayList<CinemaRoom> rooms;
	private FoodMenu menu;

	public Cinema(String name) {
		this.name = name;
		this.adress = null;
		this.phoneNr = 0;
		this.employees = new ArrayList<>();
		this.rooms = new ArrayList<>();
		this.menu = FoodMenu.NORMAL();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public long getPhoneNr() {
		return phoneNr;
	}

	public void setPhoneNr(long phoneNr) {
		this.phoneNr = phoneNr;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	
	public void addEmployee(Employee e) {
		employees.add(e);
	}

	public ArrayList<CinemaRoom> getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList<CinemaRoom> rooms) {
		this.rooms = rooms;
	}
	
	public void addRoom(CinemaRoom cr) {
		rooms.add(cr);
	}

	public FoodMenu getMenu() {
		return menu;
	}

	public void setMenu(FoodMenu menu) {
		this.menu = menu;
	}

}
