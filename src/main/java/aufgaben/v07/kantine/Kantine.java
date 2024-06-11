package main.java.aufgaben.v07.kantine;

import main.java.aufgaben.v07.Kaffeeautomat;
import main.java.aufgaben.v07.Kaffeesorte;
import main.java.aufgaben.v07.Softdrinkautomat;
import main.java.aufgaben.v07.Softdrinksorte;

public class Kantine {
	public static void main(String[] args) {
		Kaffeeautomat kva0815 =
				new Kaffeeautomat("KVA-0815", 100, Kaffeesorte.KAFFEE);
		System.out.println(kva0815.getBeschreibung());

		Kaffeeautomat kva007 =
				new Kaffeeautomat("KVA-007", 40, Kaffeesorte.CAPPUCCINO);
		System.out.println(kva007.getBeschreibung());
		kva007.fuegeBohnenEin(70);

		Softdrinkautomat sda001 =
				new Softdrinkautomat("SDA-001", 50, Softdrinksorte.FANTA);
		System.out.println(sda001.getBeschreibung());

		sda001.fuelleSirupEin(20);
		System.out.println(sda001.getBeschreibung());
	}
}
