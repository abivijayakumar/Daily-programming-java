import java.util.Scanner;
public class main{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter a number:");
int n = scan.nextInt();
for(int i = 1;i * i <=n;i++){
if(n % i ==0){
System.out.println(i + " x " + (n / i));
  }
 }
}