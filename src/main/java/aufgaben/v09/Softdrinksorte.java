package main.java.aufgaben.v09;

public enum Softdrinksorte {
	COLA,
	FANTA,
	SPRITE;

	public String getName()
	{
		return Character.toUpperCase(name().charAt(0)) + name().substring(1).toLowerCase();
	}
}
