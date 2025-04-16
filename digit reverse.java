import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner scan =new Scanner(System.in);
    System.out.print("Enter a number reverse:");
    int number =scan.nextInt();
    int reverse =0;
    System.out.println("The reversed number is:"+reverse);
    scan.close();
  }
}
