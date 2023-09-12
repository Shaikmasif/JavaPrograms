package com.objectcreation;

public class Bike {
	String name;
	String company;
	String color;
	String weight;
	String milage;
	String engine_capacity;
	String tank_capacity;
	String top_speed;
	int cylinder;
	String type;
	int cost;
	Bike(String name,String company,String color,String weight,String milage,String engine_capacity,String tank_capacity,String top_speed,int cylinder,String type,int cost)
	{
		super();
		this.name=name;
		this.company=company;
		this.color=color;
		this.weight=weight;
		this.milage=milage;
		this.engine_capacity=engine_capacity;
		this.tank_capacity=tank_capacity;
		this.top_speed=top_speed;
		this.cylinder=cylinder;
		this.type=type;
		this.cost=cost;
	}
	void moving()
	{
		System.out.println(name+" Bike of "+company+" company of "+color+" color with "+top_speed+" top speed and having "+cylinder+" cylinders is moving");
	}
	void horn()
	{
		System.out.println(name+" Bike of "+company+" company of "+color+" color with "+top_speed+" top speed and having "+cylinder+" cylinders is blowing horn");;
	}

}
