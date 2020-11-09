

enum State
{
	KARNATAKA,GOA,MAHARASHTRA,KERALA,PUNJAB
}

public class StatesInIndia{

public static void main(String[] state)
{
	
	String statesInIdia="KARNATAKA";
	
	State convertedStateFromString=State.valueOf(statesInIdia);
	
	System.out.println(convertedStateFromString);
	
	
	State[] allStates=State.values();
	System.out.println(allStates.length);
	//length will be +1 of index
	for(int statesInitial=0;statesInitial<allStates.length;statesInitial++){
		System.out.println("index " + statesInitial);
		State stateValue=allStates[statesInitial];
		System.out.println("state enum Value " + stateValue);
		
	}
	
	

}

}