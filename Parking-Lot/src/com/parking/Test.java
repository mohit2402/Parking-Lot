package com.parking;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ParkingLot parkingLot = new ParkingLot();
		
	    while(true)
	    {
	    	String input = sc.nextLine();
	    	
	    	String[] split = input.split(" ");
	    	
	    	if(split[0].equalsIgnoreCase("create_parking_lot"))
	    	{
	    		System.out.println(parkingLot.create(split[1]));
	    	}
	    	else if(split[0].equalsIgnoreCase("park"))
	    	{
	    		System.out.println(parkingLot.park(split[1], split[2]));
	    	}
	    	else if(split[0].equalsIgnoreCase("leave"))
	    	{
	    		System.out.println(parkingLot.leave(split[1]));
	    	}
	    	else if(split[0].equalsIgnoreCase("status"))
	    	{
	    		parkingLot.status();
	    	}
	    	else if(split[0].equalsIgnoreCase("registration_numbers_for_cars_with_colour"))
	    	{
	    		if(parkingLot.registrationWithColor(split[1]).isEmpty())
	    		{
	    			System.out.println("Not found");
	    		}
	    		else {
	    			String s = String.join(",", parkingLot.registrationWithColor(split[1]));
	    			System.out.println(s);
	    		}
	    	}
	    	else if(split[0].equalsIgnoreCase("slot_numbers_for_cars_with_colour"))
	    	{
	    		if(parkingLot.registrationWithColor(split[1]).isEmpty())
	    		{
	    			System.out.println("Not found");
	    		}
	    		else {
	    			String s = String.join(",", parkingLot.slotNoWithColor(split[1]));
	    			System.out.println(s);
	    		}
	    	}
	    	else if(split[0].equalsIgnoreCase("slot_number_for_registration_number"))
	    	{
	    		if(parkingLot.slotWithRegistration(split[1]) == 0)
	    		{
	    			System.out.println("Not found");
	    		}
	    		else {
	    			
	    			System.out.println(parkingLot.slotWithRegistration(split[1]));
	    		}
	    	}
	    	else if(split[0].equalsIgnoreCase("exit"))
	    	{
	    		break;
	    	}
	    	else {
	    		System.out.println("Invalid Input!! Please provide valid inputs");
	    	}
	    }
	}

}
