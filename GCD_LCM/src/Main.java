import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] answer = solution(a,b);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(int n, int m) {
        if(n > m){
            int temp = m;
            m = n;
            n = temp;
        }
        int result = gcd(n,m);
        return new int[]{result,(n*m)/result};
    }
    public static int gcd(int a , int b){
        if(a%b == 0) {
            return b;
        }
        return gcd(b, a%b);
    }
}
