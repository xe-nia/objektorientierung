package main.java.aufgaben.eins;

public class Kantine {
	public static void main(String[] args) {
		Kaffeautomat kaffeeautomat = new Kaffeautomat();
		kaffeeautomat.bezeichnung = "KVA-0815";
		kaffeeautomat.kaffeesorte = "Kaffee";
		kaffeeautomat.fuellstand = 100;

		System.out.println(kaffeeautomat.getBeschreibung());

		Kaffeautomat andererAutomat = new Kaffeautomat();
		andererAutomat.bezeichnung = "KVA-007";
		andererAutomat.kaffeesorte = "Cappuccino";
		andererAutomat.fuellstand = 40;

		System.out.println(andererAutomat.getBeschreibung());

		andererAutomat.kaffeesorte = "Espresso";
		System.out.println(andererAutomat.getBeschreibung());

	}
}
