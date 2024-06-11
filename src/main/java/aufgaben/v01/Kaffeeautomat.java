package main.java.aufgaben.v01;

public class Kaffeeautomat {
	String bezeichnung;
	String kaffeesorte;
	Integer fuellstand;

	String getBeschreibung() {
		return "Kaffeeautomat " + bezeichnung + " für " + kaffeesorte
				+ " mit Füllstand " + fuellstand + "%";
	}
}

