import java.util.Scanner;

public class AgeIn5 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.println("Hello. What is your name?");
		name = keyboard.next();
		
		System.out.println(name);
		
		System.out.println("Hi, " + name + "! How old are you?");
		age = keyboard.nextInt();
		
		System.out.println("In five years you will be " + (age + 5) + ". And five years ago you were " + (age - 5) + ".");
		name = keyboard.next();
		
		keyboard.close();
	}
}