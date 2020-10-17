//invoking write method three times in main function
//printing marks of internals for a particular subject
//using while loop for invoking write method 3 times
class Example3
{
public static void main(String[] p)
{
	System.out.println("Print the marks obtained in 3 times java");
	int i=0;
	while(i<3){
		write();
		++i;
	}
}
public static void write()
{
	System.out.println("First Internal Assessment:26");
	//due to invoking same method 3 times it  print the above line 3 times
	
}
}
