import java.util.Scanner;

public class MethodPass
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int n;
		System.out.print("Pick a number: ");
		n = keyboard.nextInt();		
			if(n % 3 == 0)
			{
				System.out.println("I like that number");
			}
			else if(n % 3 != 0)
			{
				System.out.println("That number is gross...");
			}
		keyboard.close();
	}
}
