import java.util.Scanner;

public class CountingMachineRevisited2
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int number;
		int countby;
		int countfrom;
		
		System.out.print("Count by: ");
		countby = keyboard.nextInt();
		
		System.out.print("Count to: ");
		number = keyboard.nextInt();
		
		System.out.print("Count from: ");
		for(countfrom = keyboard.nextInt(); countfrom <= number; countfrom = countfrom + countby)
		{
			System.out.print(countfrom + " ");
		}
		
		keyboard.close();
	}
}
