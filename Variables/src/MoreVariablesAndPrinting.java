// talk about my physical appearance
public class MoreVariablesAndPrinting 
{
	public static void main( String[] args)
	{
		String myName, myEyes, myTeeth, myHair;
		int myAge, myHeight, myWeight;
		double centHeight, centWeight;
		
		myName = "Collin Paiz";
		myAge = 16;		// not a lie
		myHeight = 70;	// inches
		myWeight = 140;	// lbs
		myEyes = "Brown";
		myTeeth = "White";
		myHair = "Dark Brown";
		centHeight = myHeight * 2.54;
		centWeight = myWeight * .454;
		
		System.out.println( "Let's talk about " + myName + ".");
		System.out.println( "He's " + myHeight + " (or " + centHeight + " cm) inches tall.");
		System.out.println( "He's " + myWeight + " (or " + centWeight + " kg) pounds heavy.");
		System.out.println( "Actually, that's not too heavy.");
		System.out.println( "He's got " + myEyes + " eyes and " + myHair + " hair.");
		System.out.println( "His teeth are usually " + myTeeth + "depending on the coffee.");
		
		// This line is tricky; try to get it exactly right.
		System.out.println( "if I add " + myAge + ", " + myHeight + ", and " + myWeight + " I get " + (myAge + myHeight + myWeight) + ".");
		
	}

}
