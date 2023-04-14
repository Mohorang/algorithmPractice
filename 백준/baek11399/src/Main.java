import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        int[] sum = new int[N];
        sum[0] = A[0];
        int result = A[0];
        for (int i = 1; i < N; i++) {
            sum[i] = sum[i-1] + A[i];
            result += sum[i];
        }
        System.out.println(result);
    }
}