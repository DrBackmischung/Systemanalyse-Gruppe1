package de.mathisneunzig.kino.datamodel;

import java.util.ArrayList;

public class MovieTimeTable {
	
	private ArrayList<Show> timetable;

	public MovieTimeTable() {
		this.timetable = new ArrayList<>();
	}
	
	public void addMovie(Show s) {
		timetable.add(s);
	}
	
	public void removeMovie(Show s) {
		timetable.remove(s);
	}

	public ArrayList<Show> getTimetable() {
		return timetable;
	}

	public void setTimetable(ArrayList<Show> timetable) {
		this.timetable = timetable;
	}
	
	
	
}
