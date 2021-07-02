package de.mathisneunzig.systemanalyse;

public class Main {
	
	public static void main(String[] args) {
		
		Fahrer f = new Fahrer("Rainer Zufall", new Auto("Weiss", "OL-FN-193"));
		
		f.getAuto().getMotor().setGeschwindigkeit(f.getAuto().getMotor().getGeschwindigkeit()+5);
		f.getAuto().getRadio().setSender(917);
		f.getAuto().getScheibenwischer().setStufe(5);
		
	}

}
