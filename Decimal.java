import java.util.*;
class Main{
  public static int binaryToDecimal(String binary){
    int decimal(String binary)
      {
      int decimal = Integer.parseInt(binary,2);
    return decimal;
  }
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String binary = scan.nextLine();
    System.out.println(binaryToDecimal(binary));
  }
}
