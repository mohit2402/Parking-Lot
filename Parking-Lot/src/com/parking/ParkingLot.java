package com.parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
	
	private String[] registrationNo;
	private String[] color;
	
	
	
	public String[] getRegistrationNo() {
		return registrationNo;
	}



	public void setRegistrationNo(String[] registrationNo) {
		this.registrationNo = registrationNo;
	}



	public String[] getColor() {
		return color;
	}



	public void setColor(String[] color) {
		this.color = color;
	}



	public String create(String slot) {
		int s = Integer.parseInt(slot);
		if (this.registrationNo == null && this.color == null) {
			this.setRegistrationNo(new String[s]);
			this.setColor(new String[s]);

			return "Created a parking lot with " + slot + " slots";
		}
		return "slot is already created";
	}
	
	public String park(String no, String color)
	{
		int i;
		for(i=0;i<this.color.length;i++)
		{
			if(this.color[i]==null || this.color[i].isEmpty())
			{
				this.color[i] = color;
				this.registrationNo[i] = no;
				
				return "Allocated slot number: "+(i+1);
				
				}
		}
		
		return "Sorry, parking lot is full";
	}
	
	public String leave(String slot)
	{
		int s = Integer.parseInt(slot);
		this.registrationNo[s-1] = "";
		this.color[s-1] = "";
		
		return "Slot number "+slot+" is free";
	}
	
	public void status()
	{
		int i;
		
		System.out.println("Slot No.");
		for(i=0;i<this.color.length;i++)
		{
			if(this.color[i]!=null && !this.color[i].isEmpty())
			System.out.println(i+1);
		}
		
		System.out.println("Registration No");
		for(i=0;i<this.color.length;i++)
		{
			if(this.registrationNo[i]!=null && !this.registrationNo[i].isEmpty())
			System.out.println(this.registrationNo[i]);
		}
		
		System.out.println("Colour");
		for(i=0;i<this.color.length;i++)
		{
			if(this.color[i]!=null && !this.color[i].isEmpty())
			System.out.println(this.color[i]);
		}
		
	}
	
	public List<String> registrationWithColor(String color)
	{
		List<String> list = new ArrayList<>();
		int i;
		for(i=0;i<this.color.length;i++)
		{
			if(this.color[i].equalsIgnoreCase(color))
			{
				list.add(this.registrationNo[i]);
			}
		}
		
		return list;
	}
	
	public List<String> slotNoWithColor(String color)
	{
		List<String> list = new ArrayList<>();
		int i;
		for(i=0;i<this.color.length;i++)
		{
			if(this.color[i].equalsIgnoreCase(color))
			{
				list.add(String.valueOf(i+1));
			}
		}
		
		return list;
	}
	
	public int slotWithRegistration(String registration)
	{
		
		int i;
		for(i=0;i<this.color.length;i++)
		{
			if(this.registrationNo[i].equalsIgnoreCase(registration))
			{
				return i+1;
			}
		}
		
		return 0;
	}
	

}
