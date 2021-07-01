package de.mathisneunzig.kino.datamodel;

public class MajoyCustomer extends Customer {

	public MajoyCustomer(String firstName, String lastName, String email, String passwordHash, int loyaltyPoints) {
		super(firstName, lastName, email, passwordHash, loyaltyPoints);
		role = User.MAYORCUSTOMER;
	}

}
