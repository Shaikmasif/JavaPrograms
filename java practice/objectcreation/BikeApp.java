package com.objectcreation;

import java.util.Scanner;

public class BikeApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name of the bike :");
		String name=scan.next();
		System.out.println("Enter the company of the bike :");
		String company=scan.next();
		System.out.println("Enter the color of the bike :");
		String color=scan.next();
		System.out.println("Enter the weight of the bike:");
		String weight=scan.next();
		System.out.println("Enter the milage of the bike :");
		String milage=scan.next();
		System.out.println("Enter the engine capacity of the bike :");
		String engine_capacity=scan.next();
		System.out.println("Enter the tank capacity of the bike :");
		String tank_capacity=scan.next();
		System.out.println("Enter the top speed of the bike :");
		String top_speed=scan.next();
		System.out.println("Enter the number of cylinder of the bike :");
		int cylinder=scan.nextInt();
		System.out.println("Enter the type of the bike :");
		scan.nextLine();
		String type=scan.nextLine();
		System.out.println("Enter the cost of the bike :");
		int cost=scan.nextInt();
		Bike b=new Bike(name,company,color,weight,milage,engine_capacity,tank_capacity,top_speed,cylinder,type,cost);
		b.moving();
		b.horn();
	}

}
