// lists my current quarter 2 schedule
public class YourSchedule 
{
	public static void main( String[] args)
	{
		String myName, myFirst, mySecond, myThird, myFourth, myTone, myTtwo, myTthree, myTfour;
		int myPer1, myPer2, myPer3, myPer4;
		
		myName = "Collin Paiz";
		myFirst = "Math 3 Honors";
		mySecond = "Exploring Computer Science";
		myThird = "AP US History";
		myFourth = "Unscheduled";
		myTone = "Shultis";
		myTtwo = "Mauro";
		myTthree = "Spilkin";
		myTfour = "N/A";
		myPer1 = 1;
		myPer2 = 2;
		myPer3 = 3;
		myPer4 = 4;
		
		System.out.println( myName + "'s Class Schedule");
		System.out.println( "-------------------------------------------------------------------------");
		System.out.println( "|Per " + myPer1 + "   |	" + myFirst + "			|	" + myTone + "		|");
		System.out.println( "|Per " + myPer2 + "   |	" + mySecond + "	|	" + myTtwo + "		|");
		System.out.println( "|Per " + myPer3 + "   |	" + myThird + "			|	" + myTthree + "		|");
		System.out.println( "|Per " + myPer4 + "   |	" + myFourth + "			|	" + myTfour + "		|");
		System.out.println( "-------------------------------------------------------------------------");
	}
}
