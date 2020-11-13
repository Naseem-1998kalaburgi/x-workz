package com.xworkz.online;

public class NumberTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("jvm kareyuvudu main");
        System.out.println("Total numbers to search" +PhoneDirectory.totalNumbers());
		
		PhoneDirectory.search("9876543210");

		System.out.println("main nirgamana");

	}

}
