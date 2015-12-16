package com.gmail.adruijter;

public class Whale extends Zoogdier
{
	// Fields
	private int amountOfFins;
	
	// Properties
	public int getAmountOfFins()
	{
		return this.amountOfFins; 
	}
	public void setAmountOfFins(int amountOfFins)
	{
		this.amountOfFins = amountOfFins;
	}
	
	// Constructor
	public Whale(int amountOfFins, int amountOfLegs, String sound, 
						String favoriteFood, String nameSpecies, short lifeExpectancy)
	{	
		super(amountOfLegs, sound, favoriteFood, nameSpecies, lifeExpectancy);
		this.amountOfFins = amountOfFins;
	}
	
	// Overriding a method
	public void ShowProps()
	{
		System.out.printf("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n" +
						  "Ik heb %s rugvinnen!",
						  Integer.toString(this.amountOfFins));
		super.ShowProps();
	}
	
	// Methods
	
}
