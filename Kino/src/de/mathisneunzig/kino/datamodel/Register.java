package de.mathisneunzig.kino.datamodel;

public class Register extends Employee {

	public Register(String firstName, String lastName, String email, String passwordHash, String title) {
		super(firstName, lastName, email, passwordHash, title);
		role = User.REGISTER;
	}

}
