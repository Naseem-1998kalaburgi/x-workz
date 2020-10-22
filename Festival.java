public class Festival{
	public static void main(String[] politician)
	{
		System.out.println("JVM invoke main method");
		String[] ministersArray={"BSY",
		"HDK",
		"Siddhramiah",
		"Jagdeesh Shettar",
		"Sri Krishna"
		};
		chiefMinisters(ministersArray);
		//chiefMinisters(null);
		System.out.println("Exit main");
	}
	public static void chiefMinisters(String[] names)
	{
	  System.out.println("chiefMinisters" +names);
      int size=names.length;
      System.out.println(size);
      String elementAtIndex0=names[0];
      System.out.println("Chief Minister @ index 0 :" +elementAtIndex0);
      //or we can print the values as follow
     
     System.out.println("Chief Ministers @ index 1 :" +names[1]);	 
	}
}