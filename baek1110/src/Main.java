import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int standard = Integer.parseInt(br.readLine());
        int run = standard;
        int count =0;
        int a1,a10,next;
        while(true){
            a10 = run/10;
            a1 = run%10;
            next = (a10 + a1) + a1*10;
            if(a10 + a1 > 9){
                next = (a10 + a1)%10 + a1*10;
            }

            if(next == standard){
                count++;
                break;
            }
            else{
                count++;
                run = next;
            }

        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
