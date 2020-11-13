package com.xworkz.online;

public class PhoneDirectory {
	private static String[] numbers = { "9876543210", "8765432109", "7654321098", "6543210987", "9123456789", "8123456789", "7123456789",
		"8765467890","9876545678","7656789098"};

public static void search(String mobileNum) 
{
	System.out.println("search kareyuvudu");
	System.out.println("Total numbers available" + numbers.length);
	System.out.println("arg1 :" + mobileNum);
	boolean numberFound = false;
	for (int count = 0; count < numbers.length; count++) 
	{
		//System.out.println("number at position " + items[count]);
		String number = numbers[count];
		if (number.equals(mobileNum)) 
		{
			// System.out.println("number is found");
			numberFound = true;
			break;
		} 
		else {
			// System.out.println("number is not found");
			numberFound = false;
		}

	}
	if(numberFound) {
		System.out.println("number is found");
	}
	else {
		System.out.println("number is not found");
		
	}
	System.out.println("search nirgamana");

}
public static int totalNumbers() {
	return numbers.length;
}
}

	