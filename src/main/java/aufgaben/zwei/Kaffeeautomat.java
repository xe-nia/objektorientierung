package main.java.aufgaben.zwei;

public class Kaffeeautomat {
	private String bezeichnung = "KVA-000";
	private String kaffeesorte = "Kaffee";
	private Integer fuellstand = 0;

	public String getBezeichnung() {
		return bezeichnung;
	}

	public String getKaffeesorte() {
		return kaffeesorte;
	}

	public Integer getFuellstand() {
		return fuellstand;
	}

	public void setBezeichnung(String neueBezeichnung) throws IllegalAccessException {
		if (neueBezeichnung == "" || neueBezeichnung == null)
		{
			throw new IllegalAccessException("Bezeichnung darf nicht leer sein.");
		}
		bezeichnung = neueBezeichnung;
	}
	public void setKaffeesorte(String neueKaffeesorte) throws IllegalAccessException {
		if (!"Kaffee".equals(neueKaffeesorte) && !"Cappuccino".equals(neueKaffeesorte) && !"Espresso".equals(neueKaffeesorte))
		{
			throw new IllegalAccessException(neueKaffeesorte + " ist keine gültige Kaffeesorte.");
		}
		kaffeesorte = neueKaffeesorte;
	}

	public void setFuellstand(Integer neuerFuellstand) throws IllegalAccessException {
		if (neuerFuellstand < 0 || neuerFuellstand > 100)
		{
			throw new IllegalAccessException(neuerFuellstand + " kein gültiger Füllstand.");
		}
		fuellstand = neuerFuellstand;
	}

	String getBeschreibung() {
		return "Kaffeeautomat " + bezeichnung + " für " + kaffeesorte
				+ " mit Füllstand " + fuellstand + "%";
	}
}

