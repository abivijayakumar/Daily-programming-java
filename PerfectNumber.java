import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number:");
    int n = scan.nextInt();
    int sum = 0;
    for(int i =1;i < n;i++){
      if(n % i == 0) sum +=i;
    }
    if(sum == n){
      System.out.println(n + " is a perfect Number");
    } else {
      System.out.println(n + " is not a perfect Number");
    }
  }
}
