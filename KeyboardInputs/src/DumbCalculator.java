import java.util.Scanner;

public class DumbCalculator 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double numberOne, numberTwo, numberThree;
		
		System.out.print("What is the first number? ");
		numberOne = keyboard.nextDouble();
		
		System.out.print("What is the second number? ");
		numberTwo = keyboard.nextDouble();
		
		System.out.print("What is the third number? ");
		numberThree = keyboard.nextDouble();
		
		System.out.print("The average of the numbers is " + ((numberOne + numberTwo + numberThree)/3));
		
		keyboard.close();
	}

}
