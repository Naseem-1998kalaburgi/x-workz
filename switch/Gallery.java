public class Gallery
{
	public static void main(String[] photos)
	{
		System.out.println("Invoked main, doing switch");
		
		String storeIn=photos[0];
		switch(storeIn)
		{
			case "Private":
			      System.out.println("store Image in private folder");
				  System.out.println("stored on Nov 7");
				  break;
			case "Public":
                  System.out.println("store Image in public folder");
				  System.out.println("stored on Nov 7");
				  break;
            case "Cloud":
                  System.out.println("store Image in cloud folder");
				  System.out.println("stored on Nov 7");
				  break;
            default :
                  System.out.println("Images cannot stored");			
		}
		
		System.out.println("EXIT :: main method");
	}
}