package main.java.aufgaben.zwei;

public class Kantine {
	public static void main(String[] args) {
		Kaffeeautomat kaffeeautomat = new Kaffeeautomat();
		kaffeeautomat.setBezeichnung("KVA-0815");
		kaffeeautomat.setKaffeesorte("Kaffee");
		kaffeeautomat.setFuellstand(100);

		System.out.println(kaffeeautomat.getBeschreibung());

		Kaffeeautomat andererAutomat = new Kaffeeautomat();
		andererAutomat.setBezeichnung("KVA-007");
		andererAutomat.setKaffeesorte("Cappuccino");
		andererAutomat.setFuellstand(40);

		System.out.println(andererAutomat.getBeschreibung());

		andererAutomat.setKaffeesorte("Espresso");
		System.out.println(andererAutomat.getBeschreibung());

	}
}
