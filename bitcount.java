import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    int count = 0;
    while (num1 !=0 || num2 !=0){
      if((num1 & 1) != (num2 & 1)){
        count++;
      }
      num1 >>= 1;
      num2 >>= 1;
    }
    System.out.println(count);
    scanner.close();
  }
}
