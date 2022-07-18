import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            int height = Integer.parseInt(st.nextToken());
            int width = Integer.parseInt(st.nextToken());
            int people = Integer.parseInt(st.nextToken());

            int x,y;
            if((people%height) ==0){
                y = height;
                x = people/height;
            }
            else{
                y = people%height;
                x = people/height+1;
            }

            if(x<10) bw.write(y + "0"+ x + "\n");
            else bw.write(y + ""+ x + "\n");

        }
        bw.flush();
        bw.close();
    }
}
