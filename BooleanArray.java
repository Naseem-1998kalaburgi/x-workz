public class BooleanArray{
	public static void main(String[] b)
	{
		System.out.println("Invoked main method by JVM");
		booleanArray();
		System.out.println("Exiting main method");
	}
	public static void booleanArray()
	{
		System.out.println("Invoked booleanArray method");
		boolean javaIsPlatformIndependent=true;
		boolean javaIsNotSecure=false;
		boolean javaIsObjectOriented=true;
		boolean javaIsNotMultithreaded=false;
		
		boolean[] booleanValues={javaIsPlatformIndependent,javaIsNotSecure,javaIsObjectOriented,javaIsNotMultithreaded};
		
		boolean boolValueAtIndex1=booleanValues[0];
		System.out.println("Value at index one:"+boolValueAtIndex1);
		
		boolean boolValueAtIndex2=booleanValues[1];
		System.out.println("Value at index two:"+boolValueAtIndex2);
		
		boolean boolValueAtIndex3=booleanValues[2];
		System.out.println("Value at index three:"+boolValueAtIndex3);
		
		boolean boolValueAtIndex4=booleanValues[3];
		System.out.println("Value at index four:"+boolValueAtIndex4);
	}
}