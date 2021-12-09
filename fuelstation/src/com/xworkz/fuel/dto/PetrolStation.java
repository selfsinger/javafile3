package com.xworkz.fuel.dto;

public class PetrolStation {

	private String name,pump,gasolincolor;
	private String timings;
	private boolean quality;
	
	public PetrolStation(String name, String pump, String gasolincolor, String timings, boolean quality) 
	{
		super();
		this.name = name;
		this.pump = pump;
		this.gasolincolor =gasolincolor;
		this.timings = timings;
		this.quality = quality;
	}
	public String getName()
	{
		return name;
	}
	public String getPump()
	{
		return pump;
	}
	public String getGasolinColor()
	{
		return gasolincolor;
	}
    public  String getTimings()
    {
    	return timings;
    }
    public boolean getQuality()
    {
    	return quality;
    }
    public void setName(String name)
    {
    	this.name=name;
    }
    public void setPump(String pump)
    {
    	this.pump=pump;
    }
    public void setGasolinColor(String gasolincolor)
    {
    	this.gasolincolor=gasolincolor;
    }
    public void setTimings(String timings)
    {
    	this.timings=timings;
    }
    public void setQuality(boolean quality)
    {
    	this.quality=quality;
    }
	}
	
	
	

