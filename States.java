public class States{
	public static void main(String[] politician)
	{
		System.out.println("JVM invoke main method");
		String[] statesArray={"Karnataka","Gujarat","Kerala",
		"Maharashtra","Punjab","Tamil Nadu",
		"Rajasthan","Bihar","Odisha",
		"Assam","Telangana","Haryana",
		"Goa","sikkim","Uttar Pradesh","Andhra Pardesh"};
		statesInIndia(statesArray);
		System.out.println("Exit main");
		
		}
		public static void statesInIndia(String[] names)
		{
			System.out.println("statesArray " +names);
            int size=names.length;
            System.out.println(size);
            String elementAtIndex0=names[0];
            System.out.println("state @ index 0 :" +elementAtIndex0);
			System.out.println("state @ index 1 :" +names[1]);
			System.out.println("state @ index 2 :" +names[2]);
			System.out.println("state @ index 3 :" +names[3]);
			System.out.println("state @ index 4 :" +names[4]);
		}
}