package com.xworkz.dressingtable;

public class DressingTable {

	
	String name,drawers,mirror,wood;
	String dname="Dressing",tname="Table";
	
	DressingTable(String name,String drawers,String mirror,String wood)
	{
		this.name=name;
		this.drawers=drawers;
		this.mirror=mirror;
		this.wood=wood;
		
		
	}
     
	public static void main(String args[])
	{
		DressingTable dress=new DressingTable("AntonSolid","we can keep any materials we want here","a mirror in front of we can sit while dressing,putting on makeup,etc","Teak wood dresiing table adds grace and beauty to our home");
		System.out.println(dress);
		System.out.println(dress.mirror);
		System.out.println(System.identityHashCode(dress));
		System.out.println("Number of leters are used :"+dress.wood.length());
		System.out.println("Number of leters are used :"+dress.drawers.length());
		System.out.println("upper case :"+dress.wood.toUpperCase());
		System.out.println("lower case :"+dress.name.toLowerCase());
		System.out.println("index location :"+dress.drawers.indexOf("als"));
		System.out.println("name :"+dress.dname.concat(dress.tname));
		
			
			
	}
}
