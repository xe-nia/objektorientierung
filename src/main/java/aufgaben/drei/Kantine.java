package main.java.aufgaben.drei;

public class Kantine {
	public static void main(String[] args) {
		Kaffeeautomat kva0815 =
				new Kaffeeautomat("KVA-0815", "Kaffee", 100);
		System.out.println(kva0815.getBeschreibung());

		Kaffeeautomat kva007 =
				new Kaffeeautomat("KVA-007","Cappuccino", 40);
		System.out.println(kva007.getBeschreibung());

		kva007.setKaffeesorte("Espresso");
		System.out.println(kva007.getBeschreibung());

	}
}
