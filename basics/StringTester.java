package com.xworkz.basics;

public class StringTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoked main");
		String countryName;
		countryName="India";
		System.out.println(countryName);
		
        int sizeOfCountryName=countryName.length();
        System.out.println(sizeOfCountryName);
        
        countryName=countryName.toUpperCase();
        System.out.println(countryName);
        
        countryName=countryName.toLowerCase();
        System.out.println(countryName);
        
        char alphabet=countryName.charAt(3);
        System.out.println(alphabet);
        
        System.out.println("EXIT :: main");
	}

}
