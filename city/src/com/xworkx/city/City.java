package com.xworkx.city;

public class City {
	String name,state,language,country;
	
	public City(String name,String state,String language,String country)
	{
    this.name=name;
    this.state=state;
    this.language=language;
    this.country=country;
    System.out.println(name);
    System.out.println(state);
    System.out.println(language);
    System.out.println(country);
   	}
	public void city(String name,String state,String language,String country)
	{	
		System.out.println(this.name);
	    System.out.println(this.state);
	    System.out.println(this.language);
	    System.out.println(this.country);
        System.out.println();
	    System.out.println(name);
	    System.out.println(state);
	    System.out.println(language);
	    System.out.println(country);
	    
	}
}
