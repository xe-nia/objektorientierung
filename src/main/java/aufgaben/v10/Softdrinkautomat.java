package main.java.aufgaben.v10;

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

	@Override
	public String getBeschreibung()
	{
		return "Softdrinkautomat" + super.getBeschreibung();
	}

	@Override
	public void fuehreWartungDurch()
	{
		System.out.println(getBezeichnung() + ": Fülle Kühlmittel nach");
	}
}
