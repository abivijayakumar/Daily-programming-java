import java.util.Scanner;
class Main{
  public static void main(String[]args)
  {
    int year;
    Scanner leap = new Scanner(System.in);
    System.out.print("Enter a year:");
    year=leap.nextInt();
    if(year%4==0&&year%100!=0)
    {
      System.out.println("This is a leap year");
    }
    else if(year%400==0)
    {
      System.out.println("This is a leap year");
    }
    else
    {
      System.out.println("This is not a leap year");
    }
    leap.close();
  }
