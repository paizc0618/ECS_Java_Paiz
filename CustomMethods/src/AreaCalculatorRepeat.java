import java.util.Scanner;
      
      public class AreaCalculatorRepeat
      {
      	public static void main(String[] args)
      	{
              Scanner keyboard = new Scanner(System.in);
              System.out.println("Welcome to my area calculator");
              int a;
              do
              {
                  System.out.println("1) Triangle");
                  System.out.println("2) Rectangle");
                  System.out.println("3) Square");
                  System.out.println("4) Circle");
                  System.out.println("5) Quit");
                  System.out.println("Which shape: ");
                  a=keyboard.nextInt();
                  if (a==1)
                  {
                      System.out.println("Base: ");
                      int b = keyboard.nextInt();
                      System.out.println("Height: ");
                      int h=keyboard.nextInt();
                      System.out.println("The area is "+areaTriangle(b,h));
                  }
                  else if (a==2)
                  {
                      System.out.println("Length: ");
                      int l = keyboard.nextInt();
                      System.out.println("Width: ");
                      int w=keyboard.nextInt();
                      System.out.println("The area is "+areaRectangle(l,w));
                  }
                  else if (a==3)
                  {
                      System.out.println("Side: ");
                      int s = keyboard.nextInt();
                      System.out.println("The area is "+areaSquare(s));
                  }
                  else if (a==4)
                  {
                      System.out.println("Radius: ");
                      int r = keyboard.nextInt();
                      System.out.println("The area is "+areaCircle(r));
                  }
              }while (a!=5);
              keyboard.close();
          }
          public static double areaCircle(int radius)
              {
                  double result;
                  result = Math.PI*(radius*radius);
                  return result;
              }
          public static int areaRectangle(int length, int width)
              {
                  int result;
                  result = length*width;
                  return result;
              }
          public static int areaSquare(int side)
              {
                  int result;
                  result=side*side;
                  return result;
              }
          public static int areaTriangle(int base, int height)
              {
                  int result;
                  result= (base*height)/2;
                  return result;
              }
      }