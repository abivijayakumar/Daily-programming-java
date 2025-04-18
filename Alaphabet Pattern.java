import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    for(int i =1;i<row;i++){
      char alphabet = 'A';
      for(int j =1;j<1;j++){
        System.out.print(alphabet);
        alphabet ++;
       System.out.println(" ");
      }
    }
  }
}
    
