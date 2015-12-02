package com.gmail.adruijter;

public class Elephant extends Zoogdier
{
	//Fields
	private float trunkLength;
	
	//Properties
	// get property
	public float getTrunkLength()
	{
		return this.trunkLength;
	}
	// set property
	public void setTrunkLength(float trunkLength)
	{
		this.trunkLength = trunkLength;
	}
	
	// Constructor
	// Constructor
	public Elephant(float trunkLength, int amountOfLegs, String sound, String favoriteFood, String name, short lifeExpectancy)
	{
		super(amountOfLegs,sound, favoriteFood, name, lifeExpectancy);
		this.trunkLength = trunkLength;		
	}
	
	// Method
	public void ShowFields()
	{
		System.out.printf("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n" +
						  "Mijn slurflengte is: %s",
						  Float.toString(this.trunkLength));
		super.ShowProps();
	}
}
