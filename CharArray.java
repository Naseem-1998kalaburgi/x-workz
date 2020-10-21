public class CharArray{
	public static void main(String[] args)
	{
		System.out.println("Invoked main method by JVM");
		charArray();
		System.out.println("Exiting main method");
	}
	public static void charArray()
	{
		System.out.println("Invoked method charArray");
		char charecter[];
		charecter=new char[10];
		charecter[0]='a';
		charecter[1]='b';
		charecter[2]='c';
		charecter[3]='d';
		charecter[4]='e';
		charecter[5]='f';
		charecter[6]='g';
		charecter[7]='h';
		charecter[8]='i';
		charecter[9]='j';
		System.out.println("char array example");
		for(int i=0;i<charecter.length;i++)
		{
			System.out.println("Charecter at Index "+i+ ":"+charecter[i]);
		}
	}
}