public class Percentage{
	public static void main(String[] p)
	{
		System.out.println("Invoked main method by JVM");
		arrayOfPercentage();
		System.out.println("Exiting main method by JVM");
	}
	
	public static void arrayOfPercentage()
	{
		System.out.println("Invoked arrayOfPercentage method");
		
		float firstSemPercentage=78.88f;
		float secondSemPercentage=87.99f;
		float thirdSemPercentage=75.77f;
		float fourthSemPercentage=86.55f;
		
		float[] percentages={78.88f,87.99f,75.77f,86.55f};
		int sizeOfArray=percentages.length;
		System.out.println("Total Elements :"+sizeOfArray);
		
		float percentageAtIndex1=percentages[0];
		System.out.println("Percentage at index one :"+percentageAtIndex1);
		 
		float percentageAtIndex2=percentages[1];
		System.out.println("Percentage at index two :"+percentageAtIndex2);
		
		float percentageAtIndex3=percentages[2];
		System.out.println("Percentage at index three :"+percentageAtIndex3);
		
		float percentageAtIndex4=percentages[3];
		System.out.println("Percentage at index three :"+percentageAtIndex4);
		
		
	}
}