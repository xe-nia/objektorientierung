package main.java.aufgaben.v07;

public class Getraenkeautomat {
	private String bezeichnung;
	private Integer fuellstand;

	public Getraenkeautomat(String bezeichnung)
	{
		this(bezeichnung, 0);
	}

	public Getraenkeautomat(String bezeichnung, Integer fuellstand)
	{
		setBezeichnung(bezeichnung);
		setFuellstand(fuellstand);
	}
	public String getBezeichnung() {
		return bezeichnung;
	}

	public Integer getFuellstand() {
		return fuellstand;
	}

	protected void setBezeichnung(String neueBezeichnung) {
		if (neueBezeichnung.equals("") || neueBezeichnung == null)
		{
			throw new IllegalArgumentException("Bezeichnung darf nicht leer sein.");
		}
		bezeichnung = neueBezeichnung;
	}

	protected void setFuellstand(Integer neuerFuellstand) {
		if (neuerFuellstand < 0 || neuerFuellstand > 100)
		{
			throw new IllegalArgumentException(neuerFuellstand + " kein gültiger Füllstand.");
		}
		fuellstand = neuerFuellstand;
	}

	protected Integer fuelleAuf(Integer mengeInProzent)
	{
		Integer fuellmenge = mengeInProzent;
		if (getFuellstand() + fuellmenge > 100)
		{
			fuellmenge = 100 - getFuellstand();
		}
		setFuellstand(getFuellstand() + fuellmenge);

		return fuellmenge;
	}

	public String getBeschreibung() {
		return "Getränkeautomat " + getBezeichnung()
				+ " mit Füllstand " + getFuellstand() + "%";
	}
}
