import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int distance = y-x;
            int cnt = 0;

            //소수점 제거
            int max = (int)Math.sqrt(distance);
            if(max == Math.sqrt(distance)){
                cnt = max*2 -1;
            }
            else if(distance <= max*max + max){
                cnt = max*2;
            }
            else{
                cnt = max * 2 + 1;
            }

            bw.write(cnt + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
