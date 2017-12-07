import java.util.Scanner;
import java.util.Random;
public class KeepGuessing
{
	public static void main( String[] args)
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int x = 1 + r.nextInt(10);
		int guess;
		
		System.out.println("I have chosen a number between 1 and 10. Try to guess it");
		guess = keyboard.nextInt();
		
		while(guess != x)
		{
			System.out.println("That is incorrect. Guess Again.");
			guess = keyboard.nextInt();
		}
		
		if(guess == x)
		{
			System.out.println("That is correct! Good guess!");
		}
		
		keyboard.close();
	}
}
