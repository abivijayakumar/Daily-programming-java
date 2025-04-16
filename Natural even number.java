import java.util.Scanner;
public class Main{
  public static  void main(String[]args)
  {
    Scanner scan =new Scanner(System.in);
    System.out.print("Enter the number of even:");
    int n =scan.nextInt();
    System.out.println("The first "+n+"even numbers are:");
    for(int i=1;i<n;i++){
      System.out.print((i*2)+ " ");
  }
  scan.close();
  }
}
