package de.mathisneunzig.kino.datamodel;

public class Show {
	
	private Movie m;
	private Timestamp time;
	private PriceTable prices;
	private SeatOccupancyPlan seatOccupancyPlan;
	private boolean is3D;
	private boolean is4D;
	
	public Show(Movie m, Timestamp time, PriceTable prices, boolean is3D, boolean is4D) {
		super();
		this.m = m;
		this.time = time;
		this.prices = prices;
		this.seatOccupancyPlan = new SeatOccupancyPlan("Belegungsplan");
		this.is3D = is3D;
	}
	
//	public Movie getMovie() {
//		return m;
//	}
//	
//	public void setMovie(Movie m) {
//		this.m = m;
//	}
//	
//	public Timestamp getTime() {
//		return time;
//	}
//	
//	public void setTime(Timestamp time) {
//		this.time = time;
//	}
//	
//	public PriceTable getPrices() {
//		return prices;
//	}
//	public void setPrices(PriceTable prices) {
//		this.prices = prices;
//	}
	
	

}
