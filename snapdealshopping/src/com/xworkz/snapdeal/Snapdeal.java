package com.xworkz.snapdeal;

public class Snapdeal {

	private String type;
	private String items;
	private int noOfitems;
	private double price;
	private boolean bestOffers;
	
	
	public Snapdeal(String type,String items,int noOfitems,double price,boolean bestOffers)
	{
		this.type=type;
		this.items=items;
		this.noOfitems=noOfitems;
		this.price=price;
		this.bestOffers=bestOffers;
	}
	public String getType()
	{
		return type;
	}
	public String getItems()
	{
		return items;
	}
	public int getnoOfItems()
	{
		return noOfitems;
	}
	public double getPrice()
	{
		return price;
	}
	public boolean getbestOffers()
	{
		return bestOffers;
	}
	public void settype(String type)
	{
		this.type=type;
	}
	public void setItems(String items)
	{
		this.items=items;
	}
	public void setNoOfItems(int noOfitems)
	{
		this.noOfitems=noOfitems;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setBestOffers(boolean bestOffers)
	{
		this.bestOffers=bestOffers;
	}
	public static void main(String args[])
	{
		Snapdeal snap=new Snapdeal("onlineshop","cashew,anjeer,pista",3,1420,true);
		System.out.println(snap.getType());
		System.out.println(snap.getItems());
		System.out.println(snap.getnoOfItems());
		System.out.println(snap.getPrice());
		System.out.println(snap.getbestOffers());
		System.out.println();
		int review[]=new int[5];
		review[0]=1;
		review[1]=2;
		review[2]=3;
		review[3]=4;
		review[4]=5;
		System.out.println(review[4]);
		System.out.println();
		snap.settype("online");
		snap.setItems("HWbag");
		snap.setNoOfItems(2);
		snap.setPrice(2000);
		snap.setBestOffers(true);
		System.out.println(snap.getType());
		System.out.println(snap.getItems());
		System.out.println(snap.getnoOfItems());
		System.out.println(snap.getPrice());
		System.out.println(snap.getbestOffers());
		
		
		
				
	}
	
}
