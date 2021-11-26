package com.xworkz.electronics;

public class ElecItems {

	String brand;
	double price;
	String colour;
	int inches;
	
	void tv()
	{
		brand="LG";
		price=40000.00;
		colour="black";
		inches=43;
		System.out.println();
		System.out.println("brand of TV is :" +brand);
		System.out.println("Price of TV is :" +price);
		System.out.println("Colour of TV is :" +colour);
		System.out.println("Inches of TV is :" +inches);
	}
	void washingmachine()
	{
		brand="BOSCHO";
		price=37000.00;
		colour="gray";
		int weight=15;
		System.out.println();
		System.out.println("brand of washinmachine is :" +brand);
		System.out.println("Price of washinmachine is :" +price);
		System.out.println("Colour of washinmachine is :" +colour);
		System.out.println("Weight of washinmachine is :" +weight);
		coffeemaker();
	}
	void coffeemaker()
	{
		brand="Pigaon";
		price=1000.00;
		colour="silver";
		int litres=2;
		System.out.println();
		System.out.println("brand of coffeemaker is :" +brand);
		System.out.println("Price of coffeemaker is :" +price);
		System.out.println("Colour of coffeemaker is :" +colour);
		System.out.println("Litres of coffeemaker is :" +litres);
		microwave();
		tv();
		
	}
	void microwave()
	{
		brand="Samsung";
		price=15000.00;
		colour="black with flowerpicture";
		int litres=10;
		System.out.println();
		System.out.println("brand of microwave is :" +brand);
		System.out.println("Price of microwave is :" +price);
		System.out.println("Colour of microwave is :" +colour);
		System.out.println("Litres of microwave is :" +litres);
		
	}
}
