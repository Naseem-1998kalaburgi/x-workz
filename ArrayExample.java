//Example program using Array concept

public class ArrayExample{
	public static void main(String[] a)
	{
		System.out.println("Invoked main method by JVM");
		arrayOfEmail();
		System.out.println("Exiting main method by JVM");
	}
	public static void arrayOfEmail()
	{
		System.out.println("Invoked arrayOfEmail method");
		
		String emailId="nida@gmail.com";
		String anotherEmailId="nidaKK@gamil.com";
		String xworkzEmailId="nida.xworkz@gmail.com";
		 
		String[] emails={emailId,anotherEmailId,xworkzEmailId,"ruhaan@gmail.com"};
		int sizeOfArray=emails.length;
		System.out.println("Total Elements :"+sizeOfArray);
		
		String elementAtIndex1=emails[0];
		System.out.println("Element at index one :"+elementAtIndex1);
		 
		String elementAtIndex2=emails[1];
		System.out.println("Element at index two :"+elementAtIndex2);
		
		String elementAtIndex3=emails[2];
		System.out.println("Element at index three :"+elementAtIndex3);
		
		String elementAtIndex4=emails[3];
		System.out.println("Element at index three :"+elementAtIndex4);
		
		
	}	
}