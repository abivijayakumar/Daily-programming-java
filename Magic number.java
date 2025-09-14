import java.util.Scanner;

public class MagicNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int n = num;

        while (n > 9) {
            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }

        if (n == 1)
            System.out.println(num + " is a Magic Number");
        else
            System.out.println(num + " is NOT a Magic Number");
    }
}
