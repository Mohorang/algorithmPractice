import java.util.Scanner;

public class Main {
    static int[] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        A = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            A[i] = i;
        }
        //여기까지 하면 자기 인덱스값과 같은 대표값을 가지고있음

        for (int i = 0; i < M; i++) {
            int v = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (v == 0) {
                union(a, b);
            } else if (v == 1) {
                if (find(a) == find(b)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    private static void union(int a, int b) {
        int aRe = find(a);
        int bRe = find(b);
        A[bRe] = A[aRe];
    }

    private static int find(int a) {
        int aRe = A[a];
        if (aRe != A[a]) {
            aRe = find(aRe);
            A[a] = aRe;
        }
        return aRe;
    }
}