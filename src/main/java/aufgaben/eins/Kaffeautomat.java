package main.java.aufgaben.eins;

public class Kaffeautomat {
	String bezeichnung;
	String kaffeesorte;
	Integer fuellstand;

	void getBeschreibung() {
		System.out.println("Kaffeautomat " + bezeichnung + " für " + kaffeesorte
				+ " mit Füllstand " + fuellstand + "%");
	}
}
