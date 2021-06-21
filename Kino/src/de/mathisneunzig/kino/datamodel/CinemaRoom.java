package de.mathisneunzig.kino.datamodel;

public class CinemaRoom {
	
	private int roomNr;
	private int seats;
	private int seatsOcc;
	private int seatsMax;
	private int seatsDisabled;
	private MovieTimeTable timetable;
	public CinemaRoom(int roomNr, int seats, int seatsOcc, int seatsMax, int seatsDisabled, MovieTimeTable timetable) {
		super();
		this.roomNr = roomNr;
		this.seats = seats;
		this.seatsOcc = seatsOcc;
		this.seatsMax = seatsMax;
		this.seatsDisabled = seatsDisabled;
		this.timetable = timetable;
	}
	public int getRoomNr() {
		return roomNr;
	}
	public void setRoomNr(int roomNr) {
		this.roomNr = roomNr;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getSeatsOcc() {
		return seatsOcc;
	}
	public void setSeatsOcc(int seatsOcc) {
		this.seatsOcc = seatsOcc;
	}
	public int getSeatsMax() {
		return seatsMax;
	}
	public void setSeatsMax(int seatsMax) {
		this.seatsMax = seatsMax;
	}
	public int getSeatsDisabled() {
		return seatsDisabled;
	}
	public void setSeatsDisabled(int seatsDisabled) {
		this.seatsDisabled = seatsDisabled;
	}
	public MovieTimeTable getTimetable() {
		return timetable;
	}
	public void setTimetable(MovieTimeTable timetable) {
		this.timetable = timetable;
	}
	
	

}
