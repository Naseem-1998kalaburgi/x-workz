package com.xworkz.basics.pocket;

public class PocketTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoked main by JVM");
		
		PocketMoneyEstimator.request(25, "Monday");
        PocketMoneyEstimator.request(100, "Tuesday");
        
        PocketMoneyEstimator.expenditure(40);
        //System.out.println(PocketMoneyEstimator.getTotalAmount());
        System.out.println("EXIT :: main");
	}

}
