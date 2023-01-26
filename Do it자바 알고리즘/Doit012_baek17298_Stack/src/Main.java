import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * 오큰수문제 백준 17298번
 * 수를 바로 비교하는게 아닌 스택에 인덱스를 저장해서 가장 왼쪽 인덱스부터 차례대로 비교하게끔 하는게 중요
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] A = new int[N];
        int[] result = new int[N];
        String[] str = bf.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(str[i]);
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < N; i++) {
            //스택이 텅 비어있지 않고 A[i]가 A[stack.peek()]보다 크면 즉 우큰수이면 while문 안으로
            while(!stack.isEmpty() && (A[stack.peek()] < A[i])){
                result[stack.pop()] = A[i];
            }
            stack.push(i);
        }

        //이거 꼭 해야하는게 0번 인덱스 만약 큰수없어서 안빠지면 마지막에 빼줘야 한다.
        while(!stack.isEmpty()){
            result[stack.pop()] = -1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < N; i++) {
            bw.write(result[i] + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}
