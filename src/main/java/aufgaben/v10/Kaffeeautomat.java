package main.java.aufgaben.v10;

public class Kaffeeautomat extends Getraenkeautomat {
	private Kaffeesorte kaffeesorte;

	public Kaffeeautomat(String bezeichnung)
	{
		this(bezeichnung, 0, Kaffeesorte.KAFFEE);
	}

	public Kaffeeautomat(String bezeichnung, Integer fuellstand, Kaffeesorte kaffeesorte)
	{
		super(bezeichnung, fuellstand);
		setKaffeesorte(kaffeesorte);
	}
	public Kaffeesorte getKaffeesorte() {
		return kaffeesorte;
	}

	private void setKaffeesorte(Kaffeesorte neueKaffeesorte) {
		kaffeesorte = neueKaffeesorte;
	}

	public void fuegeBohnenEin(Integer mengeInProzent)
	{
		System.out.println(getBezeichnung() + ": " + fuelleAuf(mengeInProzent) + "% Bohnen aufgefüllt");
	}

	@Override
	public String getBeschreibung()
	{
		return "Kaffeautomat" + super.getBeschreibung();
	}

	@Override
	public void fuehreWartungDurch()
	{
		System.out.println(getBezeichnung() + ": Tausche Heizspirale aus");
	}
}

