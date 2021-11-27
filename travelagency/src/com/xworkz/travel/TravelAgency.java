package com.xworkz.travel;

public class TravelAgency {

	String names,work,agencies;
	String tname="Travel",aname="Ageancy";

	TravelAgency(String names,String work,String agencies)
	{
		this.names=names;
		this.work=work;
		this.agencies=agencies;
	}
	public static void main(String args[])
	{
		TravelAgency ta=new TravelAgency("Relax Travel","selling and arranging accomadations,transportation,toursn for travellers","\n 1.commercial TA,\n 2.Online TA");
		System.out.println(ta);
		System.out.println(ta.names);
		System.out.println(System.identityHashCode(ta));
		System.out.println("Number of leters are used :"+ta.names.length());
		System.out.println("Number of leters are used :"+ta.agencies.length());
		System.out.println("upper case :"+ta.agencies.toUpperCase());
		System.out.println("lower case :"+ta.names.toLowerCase());
		System.out.println("index location :"+ta.work.indexOf("sn"));
		System.out.println("name :"+ta.tname.concat(ta.aname));
		
		

	}
	
	
}
