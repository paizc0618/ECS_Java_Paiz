import java.util.Random;
import java.util.Scanner;

public class HiLow 
{
	public static void main( String[] args)
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int x = r.nextInt(100);
		int number1;
		
		System.out.println("I'm thinking of a number 1-100... Try to guess what it is.");
		number1 = keyboard.nextInt();
		
		if(number1 < x)
		{
			System.out.println("Sorry, you guessed too low. I was thinking of " + x);
		}
		if(number1 > x)
		{
			System.out.println("Sorry, you guessed too high. I was thinking of " + x);
		}
		if(number1 == x)
		{
			System.out.println("You guessed correctly!");
		}
		
		keyboard.close();
		
	}

}
