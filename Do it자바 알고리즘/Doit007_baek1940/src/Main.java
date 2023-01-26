import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];

        int count = 0;
        int si = 0;
        int ei = n-1;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        while(si < ei){
            if(a[si]+a[ei] == m){
                count++;
                si++;
                ei--;
            }else if(a[si] + a[ei] > m){
                ei--;
            }else {
                si++;
            }
        }
        System.out.println(count);
    }
}
