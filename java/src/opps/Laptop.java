package opps;

import java.util.Scanner;

public class Laptop {
	String brand = "Dell";
	int price = 450000;
	String color = "Balack";
	Laptop (String brand,int price , String color)
	{
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	void output()
	{
		System.out.println("Brand of laptop is"+ brand);
		System.out.println("Price of laptop is"+ price);
		System.out.println("Color of laptop is"+ color);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("brand name is");
		String brand = sc .next(); 
		System.out.println("price of the lap");
		
		
		
	}

	
	
	
	
	

}
