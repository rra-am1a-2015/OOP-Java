package com.gmail.adruijter;

public class Zoogdier
{
	// Fields
	private String name;
	private short amountOfLegs;
	private String favoriteFood;
	private String sound;
		
	
	// Properties
	public String getName()
	{
		return this.name;
	}	
	public void setName(String name)
	{
		this.name = name;
	}
	//getter method
	public short getAmountOfLegs()
	{
		return this.amountOfLegs;
	}	
	//setter method
	public void setAmountOfLegs(short amountOfLegs)
	{
		this.amountOfLegs = amountOfLegs;		
	}
	
	public String getFavoriteFood()
	{
		return this.favoriteFood;
	}
	public void setFavoriteFood(String favoriteFood)
	{
		this.favoriteFood = favoriteFood;
	}

	public String getSound()
	{
		return this.sound;
	}
	public void setSound(String sound)
	{
		this.sound = sound;
	}
	
	
	// Constructor
	public Zoogdier()
	{
		this.amountOfLegs = 4;
		this.favoriteFood = "Banaan";
		this.sound = "OehOehAah";
	}
	
	public Zoogdier(String name, short amountOfLegs, String favoriteFood, String sound)
	{
		this.name = name;
		this.amountOfLegs = amountOfLegs;
		this.favoriteFood = favoriteFood;
		this.sound = sound;		
	}	
	
	// Methods
	public void Show()
	{
		System.out.println("\r\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n" +
				   "De naam van het zoogdier is: " + this.getName() + "\r\n" +
				   "Het aantal benen van dit dier bedraagt: " + this.getAmountOfLegs() + "\r\n" +
				   "Het lievelingsgerecht van dit dier is: " + this.getFavoriteFood() + "\r\n" +
				   "Het geluid dat dit dier maakt is: " + this.getSound() + 
				   "\r\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n");
	}
	
	

}
