import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int sum = 0;
    do{
      sum  += num%10;
    num = num/10;
    } while(num!=0);
    System.out.println(sum);
  }
}
      
