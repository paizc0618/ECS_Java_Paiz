import java.util.Scanner;
import java.util.Random;

public class KeepGuessingCounter 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int x = 1 + r.nextInt(10);
		int guess;
		int counter = 1;
		
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		guess = keyboard.nextInt();
		
		while(guess != x)
		{
			System.out.println("That's incorrect. Guess Again.");
			guess = keyboard.nextInt();	
			counter++;
		}
		
		System.out.println("That's correct! You're a good guesser!");
		System.out.println("It only took you " + counter + " tries!");
		keyboard.close();
	}
}
