package com.xworkz.telephone;

public class Hybrid extends Telephone {

	void insert()
	{
		int price=15000;
		System.out.println("the price of hybrid type of telephone is:"+price);	
	}
	public static void main(String args[])
	{
		Hosted hos=new Hosted();
		Hybrid hyb=new Hybrid();
		hos.input(); hos.host();
		hyb.input();
		hyb.insert();
		
	}
}

