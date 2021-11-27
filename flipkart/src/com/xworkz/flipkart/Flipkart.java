package com.xworkz.flipkart;

public class Flipkart {

	String company,headquarter,products;
	boolean Indiancompany;
	String fname="flip",kname="kart";
	
	Flipkart(String company,String headquarter,String products,boolean Indiancompany)
	{
		this.company=company;
		this.headquarter=headquarter;
		this.products=products;
	}
	public static void main(String[] args)
	{
		Flipkart flip=new Flipkart("E-Commerce","Banglore","Healthy & Beauty products,Smart watches,Travel accessories,Lamps & Shades,etc",true);
		System.out.println(flip);
		System.out.println(flip.headquarter);
		System.out.println(System.identityHashCode(flip));
		System.out.println("Number of leters are used :"+flip.products.length());
		System.out.println("Number of leters are used :"+flip.company.length());
		System.out.println("upper case :"+flip.headquarter.toUpperCase());
		System.out.println("lower case :"+flip.company.toLowerCase());
		System.out.println("index location :"+flip.products.indexOf("cts"));
		System.out.println("name :"+flip.fname.concat(flip.kname));
		

	}
}
