import java.util.Arrays;
public class Main {
public static int maxKthSmallestUsage(int N, int[] usages, int
K, int M) {
Arrays.sort(usages);
for (int i = 0; i < M; i++) {
usages[0]++;
int j = 0;
while (j < N - 1 && usages[j] > usages[j + 1]) {
int temp = usages[j];
usages[j] = usages[j + 1];
usages[j + 1] = temp;
j++;
}
}
return usages[K - 1]
  }
public static void main(String[] args) {
int N = 5;
int[] usages = {1, 2, 3, 4, 5};
int K = 3;
int M = 3;
System.out.println(maxKthSmallestUsage(N, usages, K,
M));
}
}
