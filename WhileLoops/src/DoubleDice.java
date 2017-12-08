import java.util.Random;

public class DoubleDice 
{
	public static void main( String[] args)
	{
		Random r = new Random();
		int x = 1 + r.nextInt(6);
		int y = 1 + r.nextInt(6);
		System.out.println("Here comes the dice!");
		
		while(x != y)
		{		
			x = 1 + r.nextInt(6);
			y = 1 + r.nextInt(6);
			System.out.println("Roll #1: " + x);
			System.out.println("Roll #2: " + y);
			System.out.println("The total is " + (x + y));
		} 
	}
}
