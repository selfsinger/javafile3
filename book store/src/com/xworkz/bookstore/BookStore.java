package com.xworkz.bookstore;

public class BookStore {

	String name,country,collections,blocks;
	boolean bestThing;
	
	public BookStore(String name,String country,String collections,String blocks)
	{
	this.name=name;
	this.country=country;
	this.collections=collections;
	this.blocks=blocks;
	System.out.println(name);
	System.out.println(country);
	System.out.println(collections);
	System.out.println(blocks);
	
	}
	public void BookStore(boolean bestThing)
	{
		System.out.println(this.name);
		System.out.println(this.country);
		System.out.println(this.collections);
		System.out.println(this.blocks);
		System.out.println(bestThing);	
	
	}
}
