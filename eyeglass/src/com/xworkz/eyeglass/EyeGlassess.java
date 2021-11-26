package com.xworkz.eyeglass;

public class EyeGlassess {
  
	String brand;
	double price;
	String colour;
	double sightness;
	
	void eyeglass1()
	{
		this.brand="kuboraum";
		this.price=900;
		this.colour="white";
		this.sightness=0.25;
		System.out.println();
		System.out.println("Brand of eyeglass1 :"+brand);
		System.out.println("Price of eyeglass1 :"+price);
		System.out.println("Colour of eyeglass1 :"+colour);
		System.out.println("Sightness of eyeglass1 :"+sightness);
         this.eyeglass2();
	}
	void eyeglass2()
	{
		this.brand="Gucchi";
		this.price=2000;
		this.colour="red";
		this.sightness=0.30;
		System.out.println();
		System.out.println("Brand of eyeglass2 :"+brand);
		System.out.println("Price of eyeglass2 :"+price);
		System.out.println("Colour of eyeglass2 :"+colour);
		System.out.println("Sightness of eyeglass2 :"+sightness);
        
	}
	
		
	
}
