//invoking write method 3 times in main method
//we can invoke the same method multiple times by simply wrinting that method number of times 

class WriteExample
{
public static void main(String[] args)
{
   System.out.println("Invoking write method 3 times");
   write();
   write();
   write();
   
}
public static void write()
{

	System.out.println("Java is platform independent");
	//due to invoking write method 3 times the above line will be printed 3 times
}
}