import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        boolean check = true;
        //소수 판별 로직은?
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;
            for (int i = n+1; i <= 2*n; i++) {
                for (int j = 2; j*j <= i; j++) {
                    if(i%j ==0) {
                        check = false;
                        break;
                    }
                }
                if(check) count++;
                check = true;
            }
            bw.write(count +"\n");
            bw.flush();
            count = 0;
        }

    }
}
