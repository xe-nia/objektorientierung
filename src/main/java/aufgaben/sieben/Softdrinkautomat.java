package main.java.aufgaben.sieben;

public class Softdrinkautomat extends Getraenkeautomat {
	Softdrinksorte softdrinksorte;

	public Softdrinkautomat(String bezeichnung) {
		this(bezeichnung, 0, Softdrinksorte.COLA);
	}

	public Softdrinkautomat(String bezeichnung, Integer fuellstand, Softdrinksorte softdrinksorte)
	{
		super(bezeichnung, fuellstand);
		setSoftdrinksorte(softdrinksorte);
	}

	public Softdrinksorte getSoftdrinksorte() {
		return softdrinksorte;
	}

	private void setSoftdrinksorte(Softdrinksorte softdrinksorte) {
		this.softdrinksorte = softdrinksorte;
	}

	public void fuelleSirupEin(Integer mengeInProzent)
	{
		System.out.println(getBezeichnung() + ": " + fuelleAuf(mengeInProzent) + "% Sirup aufgefüllt");
	}
}
