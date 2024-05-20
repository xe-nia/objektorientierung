package main.java.aufgaben.sechs;

public class Kantine {
	public static void main(String[] args) {
		Kaffeeautomat kva0815 =
				new Kaffeeautomat("KVA-0815", 100, Kaffeesorte.KAFFEE);
		System.out.println(kva0815.getBeschreibung());

		Kaffeeautomat kva007 =
				new Kaffeeautomat("KVA-007", 40, Kaffeesorte.CAPPUCCINO);
		System.out.println(kva007.getBeschreibung());
		kva007.fuegeBohnenEin(70);

		kva007.setKaffeesorte(Kaffeesorte.ESPRESSO);
		System.out.println(kva007.getBeschreibung());

		Softdrinkautomat sda001 =
				new Softdrinkautomat("SDA-001", 50, Softdrinksorte.FANTA);
		System.out.println(sda001.getBeschreibung());
	}
}
