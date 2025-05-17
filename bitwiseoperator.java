import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int power = 1;
    int ans = num;
    while (num !=0){
      ans = ans | power;
      power <<= 2;
      num >>= 2;
    }
    System.out.println(ans);
    scan.close();
  }
}
