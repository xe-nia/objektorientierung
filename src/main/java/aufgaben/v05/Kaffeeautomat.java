package main.java.aufgaben.v05;

public class Kaffeeautomat {
	private String bezeichnung;
	private Kaffeesorte kaffeesorte;
	private Integer fuellstand;

	public Kaffeeautomat(String bezeichnung)
	{
		this(bezeichnung, Kaffeesorte.KAFFEE, 0);
	}

	public Kaffeeautomat(String bezeichnung, Kaffeesorte kaffeesorte, Integer fuellstand)
	{
		setBezeichnung(bezeichnung);
		setKaffeesorte(kaffeesorte);
		setFuellstand(fuellstand);
	}
	public String getBezeichnung() {
		return bezeichnung;
	}

	public Kaffeesorte getKaffeesorte() {
		return kaffeesorte;
	}

	public Integer getFuellstand() {
		return fuellstand;
	}

	private void setBezeichnung(String neueBezeichnung) {
		if (neueBezeichnung.equals("") || neueBezeichnung == null)
		{
			throw new IllegalArgumentException("Bezeichnung darf nicht leer sein.");
		}
		bezeichnung = neueBezeichnung;
	}
	public void setKaffeesorte(Kaffeesorte neueKaffeesorte) {
		kaffeesorte = neueKaffeesorte;
	}

	private void setFuellstand(Integer neuerFuellstand) {
		if (neuerFuellstand < 0 || neuerFuellstand > 100)
		{
			throw new IllegalArgumentException(neuerFuellstand + " kein gültiger Füllstand.");
		}
		fuellstand = neuerFuellstand;
	}

	void fuegeBohnenEin(Integer mengeInProzent)
	{
		Integer fuellmenge = mengeInProzent;
		if (getFuellstand() + fuellmenge > 100)
		{
			fuellmenge = 100 - getFuellstand();
		}
		setFuellstand(getFuellstand() + fuellmenge);
		System.out.println(getBezeichnung() + ": " + fuellmenge + "% Bohnen aufgefüllt");
	}
	String getBeschreibung() {
		return "Kaffeeautomat " + getBezeichnung() + " für " + kaffeesorte.getName()
				+ " mit Füllstand " + getFuellstand() + "%";
	}
}

