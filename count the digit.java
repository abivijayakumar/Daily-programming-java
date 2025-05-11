import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt(); 
        int count = 0;
        
        while (input != 0) {
            input = input / 10;
            count++;
        }
        
        System.out.println("Number of digits: " + count);
        scanner.close(); 
    }
}
