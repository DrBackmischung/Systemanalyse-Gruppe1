package de.mathisneunzig.kino.datamodel;

public class Show {
	
	private Movie m;
	private Timestamp time;
	private PriceTable prices;
	
	
	public Show(Movie m, Timestamp time, PriceTable prices) {
		super();
		this.m = m;
		this.time = time;
		this.prices = prices;
	}
	
	public Movie getMovie() {
		return m;
	}
	
	public void setMovie(Movie m) {
		this.m = m;
	}
	
	public Timestamp getTime() {
		return time;
	}
	
	public void setTime(Timestamp time) {
		this.time = time;
	}
	
	public PriceTable getPrices() {
		return prices;
	}
	public void setPrices(PriceTable prices) {
		this.prices = prices;
	}
	
	

}
