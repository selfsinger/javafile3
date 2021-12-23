package com.xworkz.watchhyb;

public class Analog extends Quartz{
	
	String brand="digital";
	int price=900;
	
	void insert()
	{
		System.out.println("Brand of watch is:"+brand+ "\n Price of watch is:" +price);
	}
	public static void main(String args[])
	{
		Analog a=new Analog();
		Diving d=new Diving();
		a.skinny();
		a.clock();
		a.insert();
		d.dive();
		
	}

}
