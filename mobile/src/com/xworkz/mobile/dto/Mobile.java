package com.xworkz.mobile.dto;

public class Mobile {

	private String brand;
	private String modelName;
	private int ram;
	private int memory;
	private String imeNumber;
	
	public Mobile(String brand,String modelName,int ram,int memory,String imeNumber)
	{
		this.brand=brand;
		this.modelName=modelName;
		this.ram=ram;
		this.memory=memory;
		this.imeNumber=imeNumber;
	}
	public String getBrand()
	{
		return brand;
	}
	public String getModelName()
	{
		return modelName;
	}
	public int getRam()
	{
		return ram;
	}
	public int getMemory()
	{
		return memory;
	}
	public String getImeNumber()
	{
		return imeNumber;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public void setModelName(String modelName)
	{
		this.modelName=modelName;
	}
	public void setRam(int ram)
	{
		this.ram=ram;
	}
	public void setMemory(int memory)
	{
		this.memory=memory;
	}
	public void setImeNumber(String imeNumber)
	{
		this.imeNumber=imeNumber;
	}

	}

