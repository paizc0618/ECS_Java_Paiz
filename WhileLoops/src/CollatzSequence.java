import java.util.Scanner;

public class CollatzSequence 
{
	public static void main( String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		int x;
		
		System.out.println("Let's create a Collat Sequence!");
		
		System.out.println("The Rules:");
		System.out.println("1) If the number is even, divide it by two");
		System.out.println("2) If the number is odd, multiply it by 3 and add 1");
	
		System.out.print("Starting Number: ");
		x = keyboard.nextInt();
		System.out.println("");
		
		do
		{
			if(x % 2 == 0)
			{
				System.out.print(" - " + (x / 2));
				x = (x / 2);
			}
			else
			{
				System.out.print(" - " + ((x * 3) + 1));
				x = ((x * 3) + 1);
			}	
		}while(x != 1);
		
		keyboard.close();
	}
}
