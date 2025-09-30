package com.Core;

class Charger
{
	private String brand;
	private float voltage;
	public Charger(String brand, float voltage) {
		super();
		this.brand = brand;
		this.voltage = voltage;
	}
	public String getBrand() {
		return brand;
	}
	public float getVoltage() {
		return voltage;
	}
	
}

class OS
{
	private String name;
	private int size;
	public OS(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
	
}

class Mobile
{
	OS os = new OS("Android",512);      //COMPOSITION
	
	void hasA(Charger c)
	{
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}
}



public class Aggregation {

	public static void main(String[] args) 
	{
		Charger c = new Charger("OnePlus",100.0f);    //AGGREGATION
		
		Mobile m = new Mobile();
		
		m.hasA(c);
		
		System.out.println(m.os.getName());     //COMPOSITION
		System.out.println(m.os.getSize());		//COMPOSITION

	}

}
