import java.util.Scanner;

public class AddingValuesForLoop
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double number;
		
		System.out.print("Count to: ");
		number = keyboard.nextInt();
		
		for(int n = 1; n <= number; n = n + 1)
		{
			System.out.print(n + " ");
		}
		
		System.out.println("");
		System.out.println("The sum is " + (number) * (((number / 2) + (.5))));
		
		keyboard.close();
	}
}
