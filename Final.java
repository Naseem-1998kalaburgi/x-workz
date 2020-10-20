//Example program using final keyword

public class Final{
	public static void main(String[] f)
	{
		System.out.println("In java,we cannot change the value of a final variable");
		final long aadharNumber=264548654321L;
		System.out.println("Aadhar Number :"+aadharNumber);
		final long phoneNumber=6987764365L;
		System.out.println("Phone Number:"+phoneNumber);
		final String email="xworkz@gmail.com";
		System.out.println("Email :"+email);
		//String email="xworkzodc@gmail.com"
		//this will not printed because we have used final keyword
		
	}
}