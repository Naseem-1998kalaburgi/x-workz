public class Charecters{
	public static void main(String[] c)
	{
		System.out.println("Invoked main method by JVM");
		charOfArray();
		System.out.println("Exiting main method by JVM");
	}
	public static void charOfArray()
	{
		System.out.println("Invoked charOfArray method");
		char firstCharecter='a';
		char secondCharecter='b';
		char thirdCharecter='c';
		char fourthCharecter='d';
		char fifthCharecter='e';
		char sixthCharecter='f';
		char seventhCharecter='g';
		char eighthCharecter='h';
		char ninethCharecter='i';
		char tenthCharecter='j';
		char[] charecters={'a','b','c','d','e','f','g','h','i','j'};
		int sizeOfArray=charecters.length;
		System.out.println("Total Charecters in array :"+sizeOfArray);
		
		char charAtIndex1=charecters[0];
		System.out.println("Charecter at index one :"+charAtIndex1);
		
		char charAtIndex2=charecters[1];
		System.out.println("Charecter at index two :"+charAtIndex2);
		
		char charAtIndex3=charecters[2];
		System.out.println("Charecter at index three :"+charAtIndex3);
		
		char charAtIndex4=charecters[3];
		System.out.println("Charecter at index four :"+charAtIndex4);
		
		char charAtIndex5=charecters[4];
		System.out.println("Charecter at index five :"+charAtIndex5);
		
		char charAtIndex6=charecters[5];
		System.out.println("Charecter at index six :"+charAtIndex6);
		
		char charAtIndex7=charecters[6];
		System.out.println("Charecter at index seven :"+charAtIndex7);
		
		char charAtIndex8=charecters[7];
		System.out.println("Charecter at index eight :"+charAtIndex8);
		
		
		char charAtIndex9=charecters[8];
		System.out.println("Charecter at index nine :"+charAtIndex7);
		
		char charAtIndex10=charecters[9];
		System.out.println("Charecter at index ten :"+charAtIndex8);
		
		
		
		
	}
}