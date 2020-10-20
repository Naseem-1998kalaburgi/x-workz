public class Message{
	public static void main(String[] m)
	{
		System.out.println("Invoked main method from JVM");
		printWelcome("Welcome to X-workz");
	}
	public static void printWelcome(String msg)
	{
		System.out.println("Welcome");
		System.out.println(msg);
	}
}