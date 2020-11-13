package com.xworkz.online;

public class HotelMenuSearch {
	private static String[] menu= { "dosa", "idli", "uppma","vada", "veg biryani", "chicken biryani", "poha", "chicken biryani",
			"parota","pulavo"};

	public static void search(String food) 
	{
		System.out.println("search kareyuvudu");
		System.out.println("Total items available" + menu.length);
		System.out.println("arg1 :" + food);
		boolean dishFound = false;
		for (int count = 0; count <menu.length; count++) 
		{
			//System.out.println("item at position " + items[count]);
			String dish= menu[count];
			if (dish.equals(food)) 
			{
				// System.out.println("dish is found");
				dishFound = true;
				break;
			} 
			else {
				// System.out.println("dish is not found");
				dishFound = false;
			}

		}
		if(dishFound) {
			System.out.println("dish is found");
		}
		else {
			System.out.println("dish is not found");
			
		}
		System.out.println("search nirgamana");

	}
	public static int totalMenu() {
		return menu.length;
	}


}
