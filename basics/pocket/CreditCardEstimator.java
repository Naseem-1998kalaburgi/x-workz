package com.xworkz.basics.pocket;

public class CreditCardEstimator {
private static double totalAmount;
public static void expenditure(double amount)
{  
	double limit=1000;
	System.out.println("invoked expenditure ");
	
	System.out.println("arg 1, amount :"+amount);
	if(amount<limit) {
		double totalAmount=1000;
	totalAmount=totalAmount-amount;
	System.out.println("Total amount after expenditure :"+totalAmount);
}
	else
	{
		System.out.println("Amount is crossing the limit");
	}
	System.out.println("EXIT :: expenditure");
}



}