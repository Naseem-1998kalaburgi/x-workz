public class TheaterTester
{
	public static void main(String[] movies)
	{
		System.out.println("Invoked main, doing switch and enum");
		
		TheaterFinder.lowestAndBestUsingString("PVR");
		String theaterName="PVR";
        Theater enumTheaterName=Theater.valueOf(theaterName);
        TheaterFinder.lowestAndBestUsingEnum(enumTheaterName);

        System.out.println("EXIT :: main, doing switch and enum");
		}
}