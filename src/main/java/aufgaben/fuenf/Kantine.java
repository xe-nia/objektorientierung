package main.java.aufgaben.fuenf;

public class Kantine {
	public static void main(String[] args) {
		Kaffeeautomat kva0815 =
				new Kaffeeautomat("KVA-0815", Kaffeesorte.KAFFEE, 100);
		System.out.println(kva0815.getBeschreibung());

		Kaffeeautomat kva007 =
				new Kaffeeautomat("KVA-007", Kaffeesorte.CAPPUCCINO, 40);
		System.out.println(kva007.getBeschreibung());
		kva007.fuegeBohnenEin(70);

		kva007.setKaffeesorte(Kaffeesorte.ESPRESSO);
		System.out.println(kva007.getBeschreibung());

	}
}
