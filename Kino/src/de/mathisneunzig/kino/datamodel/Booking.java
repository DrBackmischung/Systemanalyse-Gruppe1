package de.mathisneunzig.kino.datamodel;

public class Booking {
	
	private int id;
	private double price;
	private QRCode qrCode;
	private int people;
	private Show s;
	private Timestamp bookingTime;
	private User bookedBy;
	public Booking(int id, double price, QRCode qrCode, int people, Show s, Timestamp bookingTime, User bookedBy) {
		super();
		this.id = id;
		this.price = price;
		this.qrCode = qrCode;
		this.people = people;
		this.s = s;
		this.bookingTime = bookingTime;
		this.bookedBy = bookedBy;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public QRCode getQrCodeURL() {
		return qrCode;
	}
	public void setQrCodeURL(QRCode qrCodeURL) {
		this.qrCode = qrCodeURL;
	}
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}
	public Show getS() {
		return s;
	}
	public void setS(Show s) {
		this.s = s;
	}
	public Timestamp getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(Timestamp bookingTime) {
		this.bookingTime = bookingTime;
	}
	public User getBookedBy() {
		return bookedBy;
	}
	public void setBookedBy(User bookedBy) {
		this.bookedBy = bookedBy;
	}
	
	

}
