import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int[] n = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            n[i] = sc.nextInt();
        }

        long max = 0;
        long sum = 0;

        for (int i = 0; i < cnt; i++) {
            if(n[i] > max){
                max = n[i];
            }
        }

        for (int i = 0; i < cnt; i++) {
            sum += (n[i]*100.0)/max;
        }
        System.out.println(sum/cnt);
    }
}
