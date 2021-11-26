package com.xworkz.hotel;

public class Hotel {

	String name,menu,service,typeOfFood;
	double budget;
	
	void hotel1()
	{
		name="Suvidha";
		menu="food items";
		service="prvided by waiters";
		typeOfFood="Veg";
		System.out.println("\n Name of the hotel is :"+name+ "\n Menu card contains :"+menu+"\n Service :" +service+ "\n Type of food :"+typeOfFood);
		
		}
	void hotel2()
	{
		name="geetha";
		menu="food items";
		service="self";
		typeOfFood="Veg";
		System.out.println("\n Name of the hotel is :"+name+ "\n Menu card contains :"+menu+"\n Service :" +service+ "\n Type of food :"+typeOfFood);
		hotel1();
		
	}
	void hotel3()
	{
		name="Shree ashirvaad";
		menu="food items";
		service="provided by waiters";
		typeOfFood="non-veg";
		System.out.println("\n Name of the hotel is :"+name+ "\n Menu card contains :"+menu+"\n Service :" +service+ "\n Type of food :"+typeOfFood);
		hotel2();
		hotel1();
	}
}