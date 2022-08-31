import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] a = new double[N];
        double max = 0.0;
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            if(a[i] > max){
                max = a[i];
            }
        }
        double b = 0.0;
        for (int i = 0; i < N; i++) {
            b = b + a[i]/max*100;
        }
        System.out.println(b/N);
    }
}
