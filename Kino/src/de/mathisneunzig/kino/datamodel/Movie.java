package de.mathisneunzig.kino.datamodel;

public class Movie {
	
	private String name;
	private double length;
	private double rating;
	private boolean availableIn3D;
	
	public Movie(String name, double length, double rating, boolean availableIn3D) {
		super();
		this.name = name;
		this.length = length;
		this.rating = rating;
		this.availableIn3D = availableIn3D;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public boolean isAvailableIn3D() {
		return availableIn3D;
	}
	public void setAvailableIn3D(boolean availableIn3D) {
		this.availableIn3D = availableIn3D;
	}

}
