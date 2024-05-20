package main.java.aufgaben.eins;

public class Kaffeautomat {
	String bezeichnung;
	String kaffeesorte;
	Integer fuellstand;

	String getBeschreibung() {
		return "Kaffeeautomat " + bezeichnung + " für " + kaffeesorte
				+ " mit Füllstand " + fuellstand + "%";
	}
}

