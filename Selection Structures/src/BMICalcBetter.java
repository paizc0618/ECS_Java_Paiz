import java.util.Scanner;

public class BMICalcBetter 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double BMI, weight, feet, inches;
		
		System.out.println("BMI (Body Mass Index) is a way of representing your size.");
		
		System.out.println("How many feet tall are you?");
		feet = keyboard.nextInt();
		
		System.out.println("How many inches?");
		inches = keyboard.nextInt();
		
		System.out.println("How many pounds do you weigh?");
		weight = keyboard.nextInt();
		
		BMI = (weight * .4536) / (((feet + inches/12) * .3048) * ((feet + inches/12) * .3048));
		
		System.out.println("Your BMI is:" + BMI);
		
		if(BMI <= 18.5)
		{
			System.out.println("You are underweight");
		}
		
		if(BMI >= 18.5 && BMI < 25)
		{
			System.out.println("You are normal weight");
		}
		
		if(BMI >= 25 && BMI < 30)
		{
			System.out.println("You are overweight");
		}
		
		if(BMI >= 30)
		{
			System.out.println("You are obese");
		}
		
		keyboard.close();
	}
}
