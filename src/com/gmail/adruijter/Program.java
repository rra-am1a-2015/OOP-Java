package com.gmail.adruijter;

public class Program 
{
	public static void main(String[] args) 
	{
		System.out.println("Les 1 Classes in Java");
		
		Zoogdier dier, kameel;
		
		
		dier  = new Zoogdier(8, "HeppieHeppieKluckKluck", "Pinda's", "koe", (short)3);
		dier.setAmountOfLegs(12);
		dier.ShowProps();
		
		kameel = new Zoogdier(4, "Hroeaaahhh", "Hooi", "kameel",(short)50);		
		kameel.ShowProps();
		
		Elephant bertje = new Elephant(1.95f, 4, "Retteketet", "Pinda", "Elephant", (short)70);
		bertje.setSound("Teterdetet");
		bertje.ShowFields();
		
		Whale moby = new Whale(4, 0, "HuuuhHuuuaaaoooh", "Krill", "Walvis", (short)200 );
		Zoogdier walvis;
		walvis = moby;
		moby.ShowProps();
		//walvis.ShowProps();
		
		Zoogdier willy = new Whale(5, 0, "HaHo", "plankton", "Orka", (short)20);
		willy.ShowProps();
	}
}
