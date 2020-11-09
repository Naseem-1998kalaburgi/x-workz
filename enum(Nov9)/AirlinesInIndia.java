 enum Airlines
{
	AIRINDIA,INDIGO,SPICEJET,VISTARA,GOAIR,AIRASIA
}
public class AirlinesInIndia
{
public static void main(String[] flights)
{

System.out.println("invoked main, airline name using enum");
for(int initial=0;initial<flights.length;initial++){
Airlines airlineName=Airlines.valueOf(flights[initial]);

System.out.println("Airline name  "+airlineName);
}

}

}
