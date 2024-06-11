package main.java.aufgaben.v01;

public class Kantine {
	public static void main(String[] args) {
		Kaffeeautomat kaffeeautomat = new Kaffeeautomat();
		kaffeeautomat.bezeichnung = "KVA-0815";
		kaffeeautomat.kaffeesorte = "Kaffee";
		kaffeeautomat.fuellstand = 100;

		System.out.println(kaffeeautomat.getBeschreibung());

		Kaffeeautomat andererAutomat = new Kaffeeautomat();
		andererAutomat.bezeichnung = "KVA-007";
		andererAutomat.kaffeesorte = "Cappuccino";
		andererAutomat.fuellstand = 40;

		System.out.println(andererAutomat.getBeschreibung());

		andererAutomat.kaffeesorte = "Espresso";
		System.out.println(andererAutomat.getBeschreibung());

	}
}
