import java.util.Scanner;
public class Main {
    public static int factorial(int n) {
        int fact = 1;
        if (n == 0 || n == 1) {
            fact = 1;
        } else {
            for (int i = 2; i <= n; i++) { 
                fact *= i; 
            }
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is: " + factorial(num)); 
        sc.close(); 
    }
}
