package com.xworkz.shoes;

public class Sneakers {

	String brand,colour,type;
	boolean mostexpensive;
	double price;
	
	void sneaker1()
	{
		brand="Adidas";
		colour=	"black with green";	
		type="Athletic";
		mostexpensive=true;
		price=3500.00;
		System.out.println("\n Brand name is :" +brand+ "\n Colour is :" +colour+ "\n Type is :" +type+ "\n Is it most expensive? :" +mostexpensive+ "\n Price is :"+price);
		sneaker2();
	}
	
	void sneaker2()
	{
		brand="Forever Glam";
		colour=	"skyblue";	
		type="Slipon(classic)";
		mostexpensive=false;
		price=700.00;
		System.out.println("\n Brand name is :" +brand+ "\n Colour is :" +colour+ "\n Type is :" +type+ "\n Is it most expensive? :" +mostexpensive+ "\n Price is :"+price);
		sneaker3();
	}
	void sneaker3()
	{
		brand="JAK";
		colour=	"black";	
		type="Leather";
		mostexpensive=true;
		price=10000.00;
		System.out.println("\n Brand name is :" +brand+ "\n Colour is :" +colour+ "\n Type is :" +type+ "\n Is it most expensive? :" +mostexpensive+ "\n Price is :"+price);
		sneaker4();
		
	}
	void sneaker4()
	{
		brand="Hopscotch Girls";
		colour=	"green with pink";	
		type="LED lighted";
		mostexpensive=true;
		price=9500.00;
		System.out.println("\n Brand name is :" +brand+ "\n Colour is :" +colour+ "\n Type is :" +type+ "\n Is it most expensive? :" +mostexpensive+ "\n Price is :"+price);
		sneaker5();
	}
	void sneaker5()
	{
		brand="Hockwood women canvas";
		colour=	"Dark blue";	
		type="Canvas";
		mostexpensive=false;
		price=800.00;
		System.out.println("\n Brand name is :" +brand+ "\n Colour is :" +colour+ "\n Type is :" +type+ "\n Is it most expensive? :" +mostexpensive+ "\n Price is :"+price);
		
	}
	
}
