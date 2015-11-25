package com.gmail.adruijter;

public class Program {

	public static void main(String[] args) 
	{
		String firstname, infix, lastname;
		firstname = "Arjan";
		infix = "de";
		lastname = "Ruijter";
		System.out.println("Mijn naam is: " + firstname + " " + infix + " " + lastname);
		
		
		Zoogdier dier;		
		dier = new Zoogdier("Olifant", (short)4, "Pinda", "Tetterdetet", (short)70);
		dier.setAmountOfLegs((short)4);		
		dier.Show();
		
		Zoogdier kameel = new Zoogdier("Kameel", (short)4, "Hooi", "Mweeeh", (short)50);
		kameel.Show();
		
		Zoogdier aap;
		aap = new Zoogdier();
		
	}
}
