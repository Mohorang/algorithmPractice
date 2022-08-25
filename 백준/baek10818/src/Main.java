import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] b = new int[a];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < a; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        int min = b[0];
        int max = b[0];

        for (int i = 0; i < b.length; i++) {
            if(b[i] > max){
                max = b[i];
            }

            else if(b[i]<min){
                min = b[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
