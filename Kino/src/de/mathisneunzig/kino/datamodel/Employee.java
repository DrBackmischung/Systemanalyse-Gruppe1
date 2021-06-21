package de.mathisneunzig.kino.datamodel;

import java.util.ArrayList;

public class Employee extends User {
	
	String title;
	int id;

	public Employee(String firstName, String lastName, String email, String passwordHash, String title) {
		super(firstName, lastName, email, passwordHash);
		role = User.EMPLOYEE;
		this.title = title; 
	}

//	@Override
//	public String getFirstName() {
//		return firstName;
//	}
//
//	@Override
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	@Override
//	public String getLastName() {
//		return lastName;
//	}
//
//	@Override
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//	@Override
//	public String getEmail() {
//		return email;
//	}
//
//	@Override
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	@Override
//	public String getPasswordHash() {
//		return passwordHash;
//	}
//
//	@Override
//	public void setPasswordHash(String passwordHash) {
//		this.passwordHash = passwordHash;
//	}
//
//	@Override
//	public int getRole() {
//		return role;
//	}
//
	@Override
	public void addBooking(Booking b) {
		bookings.add(b);
		
	}

	@Override
	public void removeBooking(Booking b) {
		bookings.remove(b);
		
	}
//
//	@Override
//	public void setBookings(ArrayList<Booking> bookings) {
//		this.bookings = bookings;
//		
//	}
//
//	@Override
//	public ArrayList<Booking> getBookings() {
//		return bookings;
//	}

}
