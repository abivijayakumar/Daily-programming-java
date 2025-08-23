import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        // "cow","flight","flower","fow"
        String[] arr1 = n.split(" ");
        Arrays.sort(arr1);
        String fword = arr1[0]; // flower
        String lword = arr1[arr1.length - 1]; // flow
        // charAt();
        String answer = "";
        for (int idx = 0; idx <= Math.min(fword.length() - 1, lword.length() - 1); idx++) {
            if (fword.charAt(idx) != lword.charAt(idx)) {
                break;
            }
            answer += fword.charAt(idx);
        }
        System.out.println(answer);

    }
}
