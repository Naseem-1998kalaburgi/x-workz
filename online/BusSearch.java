package com.xworkz.online;

public class BusSearch {
	private static String[] places= { "bangalore", "mysore", "belguam", "hubli", "laxmeshwar", "mangalore", "karvar",
			"mumbai","delhi","hydrabad"};

	public static void search(String city) 
	{
		System.out.println("search kareyuvudu");
		System.out.println("Total cities available" + places.length);
		System.out.println("arg1 :" + city);
		boolean placeFound = false;
		for (int count = 0; count <places.length; count++) 
		{
			//System.out.println("number at position " + items[count]);
			String place = places[count];
			if (place.equals(city)) 
			{
				// System.out.println("place is found");
				placeFound = true;
				break;
			} 
			else {
				// System.out.println("place is not found");
				placeFound = false;
			}

		}
		if(placeFound) {
			System.out.println("place is found");
		}
		else {
			System.out.println("place is not found");
			
		}
		System.out.println("search nirgamana");

	}
	public static int totalPlaces() {
		return places.length;
	}
	}


