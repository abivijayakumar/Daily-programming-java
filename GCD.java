import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter first number:");
    int a = scan.nextInt();
    System.out.println("Enter second  number:");
    int b = scan.nextInt();
    while(b !=0){
      int temp = b;
      b = a % b;
      a = temp;
    }
    System.out.println("GCD: " + a);
  }
}
    
