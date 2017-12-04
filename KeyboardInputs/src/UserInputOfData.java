import java.util.Scanner;

public class UserInputOfData 
{	
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String firstName, lastName, login;
		int grade, studentID;
		double gpa;
		
		System.out.println("Please enter the following information");
		System.out.print("First Name: ");
		firstName = keyboard.next();
		
		System.out.print("Last Name: ");
		lastName = keyboard.next();
		
		System.out.print("Grade: ");
		grade = keyboard.nextInt();
		
		System.out.print("Student ID: ");
		studentID = keyboard.nextInt();
		
		System.out.print("Login: ");
		login = keyboard.next();
		
		System.out.print("GPA (0.0-4.0): ");
		gpa = keyboard.nextDouble();
		
		System.out.println("Your Information: ");
		
		System.out.println("	Login: " + login);
		
		System.out.println("	ID: " + studentID);
		
		System.out.println("	Name: " + lastName + ", " + firstName);
		
		System.out.println("	GPA: " + gpa);
		
		System.out.println("	Grade: " + grade);
		
		keyboard.close();
	}
}
