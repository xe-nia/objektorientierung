package main.java.aufgaben.fuenf;

public enum Kaffeesorte {
	KAFFEE,
	CAPPUCCINO,
	ESPRESSO;

	public String getName()
	{
		return Character.toUpperCase(name().charAt(0)) + name().substring(1).toLowerCase();
	}
}
