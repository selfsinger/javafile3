package com.xworkz.coffeecupshie;

public class Milk extends Cups {
	 void childrens()
	 {
		 System.out.println("most childrens love to drink milk in a designed cups,we can also drink milk in a coffe cups,no restrictions");
		 
	 }
	 public static void main(String args[])
	 {
		 Milk m=new Milk();
		 Coffee c=new Coffee();
		 c.drink();
		 c.shape();
		 m.childrens();
		 
	 }

}
