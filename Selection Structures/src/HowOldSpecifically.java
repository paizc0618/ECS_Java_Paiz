// what's your age and what can you do
import java.util.Scanner;

public class HowOldSpecifically 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("Hey, what's your name?");
		name = keyboard.next();
		
		System.out.print("Ok " + name + ", how old are you?");
		age = keyboard.nextInt();
		
		if(age < 16)
		{
			System.out.print("You cannot drive, vote or rent a car.");
		}
		
		if(age >=16 && age < 18)
		{
			System.out.print("You can drive but cannot vote.");
		}
		
		if(age >=18 && age < 25)
		{
			System.out.print("You can vote but not rent a car.");
		}

		if(age >=25)
		{
			System.out.print("You can pretty much do whatever you want.");
		}
		keyboard.close();
	}

}
