import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String count = sc.next();
        char[] c = count.toCharArray();

        int result =0;
        for (int i = 0; i < N; i++) {
            result += c[i] - '0';
        }
        System.out.println(result);
    }
}
