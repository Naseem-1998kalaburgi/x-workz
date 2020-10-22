public class Online{
	public static void main(String[] trainees)
	{
		System.out.println("JVM invoked main");
		// print reference representation
		System.out.println("trainees " +trainees);
		
		int sizeOfParam=trainees.length;
		System.out.println("sizeOfParam  " +sizeOfParam);
		System.out.println("Element @ index 0 " +trainees[0]);
		System.out.println("Element @ index 1 " +trainees[1]);
		System.out.println("Exit main");
		
	}
}