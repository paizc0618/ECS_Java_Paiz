import java.util.Scanner;

public class ALittleQuiz 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int answer1, answer2, answer3;
		
		System.out.println("Q1) What is the capital of Alaska?");
		System.out.println("	1) Melbourne");
		System.out.println("	2) Anchorage");
		System.out.println("	3) Juneau");
		answer1 = keyboard.nextInt();
		
		if(answer1 >= 3)
		{
			System.out.println("Correct!");
		}
		else if (answer1 > 1 && answer1 <=2)
		{
			System.out.println("Incorrect.");
		}
		else
		{
			System.out.println("Incorrect.");
		}
		
		System.out.println("Q2) Can you store the value \"cat\" in a variable of type int");
		System.out.println("	1) Yes");
		System.out.println("	2) No");
		answer2 = keyboard.nextInt();
		
		if(answer2 <= 1)
		{
			System.out.println("Correct!");
		}
		else if (answer2 >= 2)
		{
			System.out.println("Incorrect.");
		}
		else
		{
			System.out.println("Incorrect.");
		}
		
		System.out.println("Q3) What is the result of 9+6/3?");
		System.out.println("	1) 5");
		System.out.println("	2) 11");
		System.out.println("	3) 15/3");
		answer3 = keyboard.nextInt();
		
		if(answer3 >= 2 && answer3 < 3)
		{
			System.out.println("Correct!");
		}
		else if (answer1 < 2 && answer1 <2)
		{
			System.out.println("Incorrect.");
		}
		else
		{
			System.out.println("Incorrect.");
		}
		
		
	}

}
