import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int index=0;
        int index2 =0;

        for (int i = 0; i < 9; i++) {
            int b = Integer.parseInt(br.readLine());
            index++;
            if(b > max){
                max = b;
                index2 = index;
            }
        }

        System.out.println(max);
        System.out.println(index2);
    }
}
