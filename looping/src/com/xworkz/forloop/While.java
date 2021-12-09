package com.xworkz.forloop;

public class While {

	String type,color;
	
	public void coat(String name,String color)
	{
		this.type=type;
		this.color=color;
	    int value = 2;
		while(value<5)
		{
			System.out.println("type of the coat is :"+name);
			System.out.println("color of the coat is :"+color);
		    System.out.println("coat is here ,dont worry");
		    System.out.println();
		    value++;
			
		}
	}
	
     public static void main(String args[])
     {
    	 While a=new While();
    	 
    	 a.coat("megha","pink");
     }

	
	} 
     

