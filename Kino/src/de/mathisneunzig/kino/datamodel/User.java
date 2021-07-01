package de.mathisneunzig.kino.datamodel;

import java.util.ArrayList;

public abstract class User {
	
	String firstName, lastName, email, passwordHash;
	int role;
	ArrayList<Booking> bookings;
	public static final int NO_ROLE = 0;
	public static final int CUSTOMER = 1;
	public static final int MAYORCUSTOMER = 2;
	public static final int EMPLOYEE = 3;
	public static final int REGISTER = 4;
	public static final int ADMIN = 5;
	
	public User(String firstName, String lastName, String email, String passwordHash) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.passwordHash = passwordHash;
		this.role = User.NO_ROLE;
		this.bookings = new ArrayList<>();
	}
	
//	public abstract String getFirstName();
//
//	public abstract void setFirstName(String firstName);
//
//	public abstract String getLastName();
//
//	public abstract void setLastName(String lastName);
//
//	public abstract String getEmail();
//
//	public abstract void setEmail(String email);
//
//	public abstract String getPasswordHash();
//
//	public abstract void setPasswordHash(String passwordHash);
//
//	public abstract int getRole();
//	
	public abstract void addBooking(Booking b);
	
	public abstract void removeBooking(Booking b);
//	
//	public abstract void setBookings(ArrayList<Booking> bookings);
//	
//	public abstract ArrayList<Booking> getBookings();

	
}
