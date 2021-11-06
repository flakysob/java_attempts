package ders20;

public class Car 
{
	private String color;
	private String model;
	private String brand;
	private int door;
	
	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return this.color;
	}
	
	public String getModel() 
	{
		return model;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	
	public String getBrand() 
	{
		return brand;
	}
	public void setBrand(String brand) 
	{
		this.brand = brand;
	}
	
	public int getDoor() 
	{
		return door;
	}
	public void setDoor(int door) 
	{
		if(door==2 || door==4)
		{
			this.door=door;
		}
		else
		{
			System.out.println("Kapý sayýsý sadece 2 veya 4 olabilir.");
		}
		
		
		this.door = door;
	}
}
