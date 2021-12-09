package com.xworkz.umbrella;

public class Umbrella {

	String colour="red";
	String type="travlesize";
	double price=300;
	char size='S';
	
	public void open(int value)
	{
		System.out.println("umbrella is open");
		while(value<=6)
		{
			System.out.println("colour :" +colour);
			System.out.println("Type :" +type);
			System.out.println("Price :" +price);
			System.out.println("Size :" +size);
			System.out.println();
			value++;
		}
	}
	public void close(int value)
	{
		System.out.println("umbrella is close");
		while(value<6)
		{
			System.out.println("my umbrella is closed");
			++value;
				
		}
		
		}
	}
