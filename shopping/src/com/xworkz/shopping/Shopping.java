package com.xworkz.shopping;

public class Shopping {

	String type,advantages,disadvantages;
	boolean beneficial;
	
	void direct()
	{
		type="Online";
		advantages="we can shop at any time of the day,its avialble 24/7 and everyting is just a click away";
		disadvantages="It is hard to check the quality of the product and most irritation of online shoppping is waiting for delivery";
		beneficial=true;
		System.out.println();
		System.out.println("Type of shopping :"+type);
		System.out.println("Advantages of online shopping :"+advantages);
		System.out.println("Disadvantages of online shopping :"+disadvantages);
		System.out.println("it is beneficial :"+beneficial);
		indirect();
	}
		
	void indirect()
	{
		type="Offline";
		advantages="while shopping offline,we can inspect the product quality very closely ,we dont have to wait days or weeks to get the items,bcs we select smthng nd we carry it home with us and if we dont satisfy with the purchase,we can replace it by visiting stores";
		disadvantages="going from one shop to another is exhausting and time-consuming,we spend hours roaming around looking for the products we want and we probably wont get as discount on an items as we can on an online website";
		beneficial=true;
		System.out.println();
		System.out.println("Type of shopping :"+type);
		System.out.println("Advantages offline shopping :"+advantages);
		System.out.println("Disadvantages of online shopping :"+disadvantages);
		System.out.println("it is beneficial :"+beneficial);
	}
}
