import java.util.Random;
import java.util.Scanner;

public class HiLowLimited
{
	public static void main( String[] args)
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int x = r.nextInt(100);
		int number1;
		int tries = 0;
		
		System.out.println("I'm thinking of a number 1-100... Try to guess what it is.");
		number1 = keyboard.nextInt();
		tries++;
		
		while (number1 != x && tries < 7)
		{
			if(number1 < x)
			{
				System.out.println("Sorry, you guessed too low.");
			}
			if(number1 > x)
			{
				System.out.println("Sorry, you guessed too high.");
			}
			if(number1 == x)
			{
				System.out.println("You guessed correctly!");
			}
			number1 = keyboard.nextInt();
			tries++;
		}
		if (number1 == x)
			System.out.println("You guessed it! What are the odds?!");
		else if (tries >= 7)
			System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");
		keyboard.close();
	}
}
