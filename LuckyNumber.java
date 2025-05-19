import java.util.Scanner;
public class Main {
    static boolean isLucky(int n, int counter) {
        if (n < counter) return true;
        if (n % counter == 0) return false;
        return isLucky(n - (n / counter), counter + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(isLucky(n, 2) ? "Lucky Number" : "Not a Lucky Number");
        scan.close();
    }
}
