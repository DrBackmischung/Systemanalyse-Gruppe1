package de.mathisneunzig.kino.datamodel;

public class CinemaRoom {
	
	private int roomNr;
	private int seats;
	private int seatsDisabled;
	private MovieTimeTable timetable;
	private boolean canShow3D;
	private boolean canShow4D;
	private SeatingPlan seatingPlan;
	
	public CinemaRoom(int roomNr, int seats, int seatsDisabled, MovieTimeTable timetable, boolean canShow3D, boolean canShow4D, SeatingPlan seatingPlan) {
		super();
		this.roomNr = roomNr;
		this.seats = seats;
		this.seatsDisabled = seatsDisabled;
		this.timetable = timetable;
		this.canShow3D = canShow3D;
		this.canShow4D = canShow4D;
		this.seatingPlan = seatingPlan;
	}
//	public int getRoomNr() {
//		return roomNr;
//	}
//	public void setRoomNr(int roomNr) {
//		this.roomNr = roomNr;
//	}
//	public int getSeats() {
//		return seats;
//	}
//	public void setSeats(int seats) {
//		this.seats = seats;
//	}
//	public int getSeatsOcc() {
//		return seatsOcc;
//	}
//	public void setSeatsOcc(int seatsOcc) {
//		this.seatsOcc = seatsOcc;
//	}
//	public int getSeatsMax() {
//		return seatsMax;
//	}
//	public void setSeatsMax(int seatsMax) {
//		this.seatsMax = seatsMax;
//	}
//	public int getSeatsDisabled() {
//		return seatsDisabled;
//	}
//	public void setSeatsDisabled(int seatsDisabled) {
//		this.seatsDisabled = seatsDisabled;
//	}
//	public MovieTimeTable getTimetable() {
//		return timetable;
//	}
//	public void setTimetable(MovieTimeTable timetable) {
//		this.timetable = timetable;
//	}
	
	

}
