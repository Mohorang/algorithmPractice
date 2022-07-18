import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int w3,w5;

        int result;
        //5보다 작을때
        if(n/5 == 0){
            if(n%3 !=0) result = -1;
            else{
                result = n/3;
            }
        }
        //5보다 클 때
        else{
            if((n%5) %3 == 0){
                result = n%5 + (n%5)%3;
            }
            else result = -1;
        }
        bw.write(result+"");
        bw.flush();
        bw.close();
    }

}
