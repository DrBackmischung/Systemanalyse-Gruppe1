package de.mathisneunzig.kino.datamodel;

public class Admin extends Employee {

	public Admin(String firstName, String lastName, String email, String passwordHash, String title) {
		super(firstName, lastName, email, passwordHash, title);
		role = User.ADMIN;
	}

}
