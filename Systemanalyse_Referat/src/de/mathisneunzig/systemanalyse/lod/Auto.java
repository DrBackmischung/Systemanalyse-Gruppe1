package de.mathisneunzig.systemanalyse.lod;

public class Auto {
	
	private String farbe;
	private String nummernschild;
	private Motor motor;
	private Radio radio;
	private Scheibenwischer scheibenwischer;
	
	public Auto(String farbe, String nummernschild) {
		this.farbe = farbe;
		this.nummernschild = nummernschild;
		this.motor = new Motor();
		this.radio = new Radio();
		this.scheibenwischer = new Scheibenwischer();
	}
	
	public void setGeschwindigkeit(double a) {
		motor.setGeschwindigkeit(a);
	}
	
	public Double getGeschwindigkeit() {
		return motor.getGeschwindigkeit();
	}
	
	public void anschalten() {
		motor.start();
	}
	
	public void ausschalten() {
		motor.stop();
	}
	
	public void scheibenwischerAnschalten(int stufe) {
		scheibenwischer.start();
		scheibenwischer.setStufe(stufe);
	}
	
	public void scheibenwischerAusschalten() {
		scheibenwischer.stop();
	}
	
	public void scheibenwischerStufeEinstellen(int stufe) {
		scheibenwischer.setStufe(stufe);
	}
	
	public void radioAnschalten(int sender) {
		radio.start();
		radio.setSender(sender);
	}
	
	public void radioAusschalten() {
		radio.stop();
	}
	
	public void setzeSender(int sender) {
		radio.setSender(sender);
	}

}
