import java.io.*;
import java.util.StringTokenizer;

//달팽이가 낮에 A미터 올라가고 밤에 B미끄러진다. V미터인 나무막대에 오르기위해 걸리는 일수는?
//단 V미터에 도달하면 내려가지않는다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine() ," ");

        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int dest = Integer.parseInt(st.nextToken());

        //올라갔는데 목표에 도달햇으면 그걸로 끝
        int day = (dest-down)/(up-down); //도달하기 위해 필요한 최소한의 일수
        int day2 = (dest-down)%(up-down);
        if(day2 != 0) day++;

        bw.write(day + "");
        bw.flush();
        bw.close();

    }
}
