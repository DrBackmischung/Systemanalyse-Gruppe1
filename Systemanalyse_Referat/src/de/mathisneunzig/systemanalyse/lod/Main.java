package de.mathisneunzig.systemanalyse.lod;

public class Main {
	
	public static void main(String[] args) {
		
		Fahrer f = new Fahrer("Rainer Zufall", new Auto("Weiss", "OL-FN-193"));
		
		f.losfahren();
		f.beschleunigen(5);
		f.scheibenwischerAnschalten(3);
		f.radioAnschalten(617);
		f.anhalten();
		
	}

}
