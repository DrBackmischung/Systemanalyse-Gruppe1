package de.mathisneunzig.systemanalyse;

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

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public String getNummernschild() {
		return nummernschild;
	}

	public void setNummernschild(String nummernschild) {
		this.nummernschild = nummernschild;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Radio getRadio() {
		return radio;
	}

	public void setRadio(Radio radio) {
		this.radio = radio;
	}

	public Scheibenwischer getScheibenwischer() {
		return scheibenwischer;
	}

	public void setScheibenwischer(Scheibenwischer scheibenwischer) {
		this.scheibenwischer = scheibenwischer;
	}

}
