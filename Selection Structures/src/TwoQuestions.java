import java.util.Scanner;

public class TwoQuestions 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String type, size;
		
		System.out.println("Think of an object, and I'll try and guess what it is");
		
		System.out.println("Q1) Is it an animal, vegetable or mineral?");
		type = keyboard.next();
		
		System.out.println("Q2) Is it bigger than a breadbox?");
		size = keyboard.next();
		
		if(type.equals("animal") && size.equals("yes"))
		{
			System.out.println("Is it a moose?");
		}
		
		if(type.equals("animal") && size.equals("no"))
		{
			System.out.println("Is it a squirrel?");
		}
		
		if(type.equals("vegetable") && size.equals("yes"))
		{
			System.out.println("Is it a watermelon?");
		}
		
		if(type.equals("vegetable") && size.equals("no"))
		{
			System.out.println("Is it a carrot?");
		}
		
		if(type.equals("mineral") && size.equals("yes"))
		{
			System.out.println("Is it a Camaro?");
		}
		
		if(type.equals("mineral") && size.equals("no"))
		{
			System.out.println("Is it a paper clip?");
		}
		
		keyboard.close();
	}

}
