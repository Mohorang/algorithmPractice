import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] a = new int[42];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            int N = Integer.parseInt(br.readLine())%42;
            a[N]++;
        }

        int count =0;

        for (int i = 0; i < 42; i++) {
            if(a[i] > 0){
                count++;
            }
        }

        System.out.println(count);
    }
}
