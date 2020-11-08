public class TheaterFinder
{
	public static void lowestAndBestUsingString(String theaterName)
	{
		System.out.println("Invoked lowestAndBestUsingString");
		System.out.println("arg 1 theaterName "+theaterName);
		switch(theaterName)
		{
			case "PVR":
			      System.out.println("case is "+theaterName);
				  System.out.println("Rajaji Nagar");
				  System.out.println("One of the Best Theater in city");
				  break;
			case "CINEPOLIS":
                  System.out.println("case is "+theaterName);
                  System.out.println("Sai Nagar");
                  System.out.println("This theater is good");
                  break;
            case "INOX":
                  System.out.println("case is "+theaterName);
                  System.out.println("Shanti Nagar");
                  System.out.println("Its best");
                  break;
			case "SANGAM":			
			      System.out.println("case is "+theaterName);
                  System.out.println("Yellhanka new town");
                  System.out.println("Its good");
                  break;	  
				  
            default :
                   System.out.println("No theater name matched");			
		}
		System.out.println("EXIT:: lowestAndBestUsingString");
}
public static void lowestAndBestUsingEnum(Theater theaterName)
	{
		System.out.println("Invoked lowestAndBestUsingEnum");
		System.out.println("arg 1 theaterName "+theaterName);
		switch(theaterName)
		{
			case PVR:
			     System.out.println("case is "+theaterName);
				 System.out.println("Rajaji Nagar");
				 System.out.println("One of the best theater in the city");
				 break;
			case CINEPOLIS :
			     System.out.println("case is "+theaterName);
				 System.out.println("Sai Nagar");
				 System.out.println("This theater is good");
				 break;
				 
			default :
         		System.out.println("No theater name matched");	
		}
		
		System.out.println("EXIT :: lowestAndBestUsingEnum");
	}
}
