import java.util.Scanner;
import java.util.Arrays;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] L1 = new int[n];
int[] L2 = new int[n];
for (int i = 0; i < n; i++) {
L2[i] = sc.nextInt();
}
for (int i = 0; i < n; i++) {
L1[i] = sc.nextInt();
}
  for (int i = 0; i < n; i++) {
L2[i] = L2[i] - L1[i];
Arrays.sort(L2);
}
int su = 0;
int ans = 0;
for (int i = 0; i < n; i++) {
su = su + L2[i];
if (su < 0) {
ans = ans + Math.abs(su);
su = 0;
}
}
System.out.println(ans);
sc.close();
 }
}
