public class Accessories{
            public static void main(String[] accessories)
			{
			System.out.println("JVM invoked main method");
			String country="America";
			countryName("India");
			countryName(null);
			countryName(country);
			System.out.println("Exit main method");
			
			}
			public static void countryName(String name)
			{
				System.out.println("Invoked countryName method:"+name);
			}
}