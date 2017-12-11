import java.util.Random;
import java.util.Scanner;

public class ShorterDoubleDice 
{
	public static void main( String[] args)
	{		
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		String again;
		
		do
		{
			
		int x = 1 + r.nextInt(6);
		int y = 1 + r.nextInt(6);
			
		System.out.println("Roll #1: " + x);
		System.out.println("Roll #2: " + y);
		System.out.println("The total is " + (x + y));
		System.out.println("Would you like to roll again? (y/n)");
		again = keyboard.next();
		} while(again.equals("y"));
		
		keyboard.close();
	}
}
