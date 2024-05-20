package main.java.aufgaben.vier;

import java.util.Locale;

public enum Kaffeesorte {
	KAFFEE,
	CAPPUCCINO,
	ESPRESSO;

	public String getName()
	{
		return Character.toUpperCase(name().charAt(0)) + name().substring(1).toLowerCase();
	}
}
