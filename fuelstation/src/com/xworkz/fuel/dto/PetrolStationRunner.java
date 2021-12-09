package com.xworkz.fuel.dto;

public class PetrolStationRunner {

	public static void main(String args[])
	{
		PetrolStation petrol=new PetrolStation("Shree Shiva Fuel Station","Gasolin Pump","slightly bluish"," 6am to 12am ",true);
		System.out.println(petrol.getName());
		System.out.println(petrol.getPump());
		System.out.println(petrol.getGasolinColor());
		System.out.println(petrol.getTimings());
		System.out.println(petrol.getQuality());
		System.out.println();
		PetrolStation petrol2=new PetrolStation("Shiva Ganga","Gasolin Pump","slightly greenish","5am to 11am",true);
		System.out.println(petrol2.getName());
		System.out.println(petrol2.getPump());
		System.out.println(petrol2.getGasolinColor());
		System.out.println(petrol2.getTimings());
		System.out.println(petrol2.getQuality());
		System.out.println();
		
		petrol.setGasolinColor("slightlypink");
		System.out.println(petrol.getName());
		System.out.println(petrol.getPump());
		System.out.println(petrol.getGasolinColor());
		System.out.println(petrol.getTimings());
		System.out.println(petrol.getQuality());
		
	}
}
