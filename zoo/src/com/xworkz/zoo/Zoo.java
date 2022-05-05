package com.xworkz.zoo;

public class Zoo {

	String WildAnimals,birds,AnimalsCage,canteens,furnitures;
	boolean enjoyableplace;
	String fname="Ani";
	String lname="mals";
	
     Zoo(String WildAnimals,String birds,String AnimalsCage,String canteens,String furnitures,boolean enjoyableplace)
     {
    	 this.WildAnimals=WildAnimals;
    	 this.birds=birds;
    	 this.AnimalsCage=AnimalsCage;
    	 this.canteens=canteens;
    	 this.furnitures=furnitures;
    
    	 
     }
     public static void main(String args[])
     {
    	 Zoo z=new Zoo("Elephant,Tiger,Lion,Wolf,Fox","Parrots,Peacock,Herons,Strok,Owls,KingFisher","kept for large animals","available for visitors","visitors can take some rest while roaming around zoo",true);
    	 Zoo z1=new Zoo("Gorilla,Bear,Cheetah","Hornbill,Toucans,Cranes,Cockatoos","kept for large animals","available for visitors","visitors can take some rest while roaming around zoo",true);
    	 System.out.println(z);
 		System.out.println(z1);
 		System.out.println(z.WildAnimals);
 		System.out.println(z1.WildAnimals);
 		System.out.println(System.identityHashCode(z));
 		System.out.println(System.identityHashCode(z1));
 		System.out.println("Number of leters are used :"+z.canteens.length());
 		System.out.println("Number of leters are used :"+z1.furnitures.length());
 		System.out.println("upper case :"+z1.canteens.toUpperCase());
 		System.out.println("lower case :"+z.birds.toLowerCase());
 		System.out.println("index location :"+z.WildAnimals.indexOf("ox"));
 		System.out.println("name :"+z1.fname.concat(z1.lname));
 		
		
    	 
     }
	
}
