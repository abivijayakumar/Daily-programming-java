import java.util.Scanner;
class Main{
  public static void main(String[]args)
  {
    Scanner scan =new scanner(System.in);
    System.out.println("Enter the number of terms:");
    int n =scan.nextInt();
    int a=0,b=1,count=0;
    System.out.println("Fibonnaci series:");
    do{
      System.out.println(a+ " ");
      int temp=a+b;
      a=b;
      b=temp;
      count++;
    }while (count+<n);
    scan.close();
  }
}
                                                                 
