package de.mathisneunzig.systemanalyse.lod;

public class Fahrer {
	
	private String name;
	private Auto auto;
	
	public Fahrer(String name, Auto auto) {
		this.name = name;
		this.auto = auto;
	}
	
	public void losfahren() {
		auto.anschalten();
	}
	
	public void anhalten() {
		bremsen(auto.getGeschwindigkeit());
		auto.ausschalten();
	}
	
	public void beschleunigen(double a) {
		auto.setGeschwindigkeit(auto.getGeschwindigkeit()+a);
	}
	
	public void bremsen(double a) {
		auto.setGeschwindigkeit(auto.getGeschwindigkeit()-a);
	}
	
	public void scheibenwischerAnschalten(int stufe) {
		auto.scheibenwischerAnschalten(stufe);
	}
	
	public void scheibenwischerAusschalten() {
		auto.scheibenwischerAusschalten();
	}
	
	public void scheibenwischerStufeEinstellen(int stufe) {
		auto.scheibenwischerStufeEinstellen(stufe);
	}
	
	public void radioAnschalten(int sender) {
		auto.radioAnschalten(sender);
	}
	
	public void radioAusschalten() {
		auto.radioAusschalten();
	}
	
	public void setzeSender(int sender) {
		auto.setzeSender(sender);
	}

}
