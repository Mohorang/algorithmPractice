import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] s = new int[N+1];

        for (int i = 1; i <= N; i++) {
            s[i] = s[i-1] + sc.nextInt();
        }

        for (int k = 0; k < M; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(s[j] - s[i-1]);
        }
    }
}
