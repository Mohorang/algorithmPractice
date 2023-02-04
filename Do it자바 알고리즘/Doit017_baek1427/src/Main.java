import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int[] a = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            a[i] = Integer.parseInt(s.substring(i,i+1));
        }

        for (int i = 0; i < s.length(); i++) {
            int max = i;
            for (int j = i+1; j < s.length(); j++) {
                if(a[j] > a[max]){
                    max = j;
                }
            }
            if(a[max] > a[i]){
                int temp = a[i];
                a[i] = a[max];
                a[max] = temp;
            }
        }
        for (int j : a) {
            System.out.print(j);
        }
    }
}
