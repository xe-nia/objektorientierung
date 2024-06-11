package main.java.aufgaben.v04;

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

	public void setBezeichnung(String neueBezeichnung) {
		if (neueBezeichnung.equals("") || neueBezeichnung == null)
		{
			throw new IllegalArgumentException("Bezeichnung darf nicht leer sein.");
		}
		bezeichnung = neueBezeichnung;
	}
	public void setKaffeesorte(Kaffeesorte neueKaffeesorte) {
		kaffeesorte = neueKaffeesorte;
	}

	public void setFuellstand(Integer neuerFuellstand) {
		if (neuerFuellstand < 0 || neuerFuellstand > 100)
		{
			throw new IllegalArgumentException(neuerFuellstand + " kein gültiger Füllstand.");
		}
		fuellstand = neuerFuellstand;
	}

	String getBeschreibung() {
		return "Kaffeeautomat " + bezeichnung + " für " + kaffeesorte.getName()
				+ " mit Füllstand " + fuellstand + "%";
	}
}

