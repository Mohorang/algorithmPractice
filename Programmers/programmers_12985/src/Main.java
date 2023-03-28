import java.util.*;
public class Main {
    public static void main(String[] args){
        int N = 8;
        int A = 4;
        int B = 16;
        int answer = 0;
        if(A>B){
            int temp=0;
            temp = A;
            A = B;
            B = temp;
        }
        int a = (int) (Math.log(N) / Math.log(2));
        for (int i = 0; i < a; i++) {
            answer++;
            A = A/2 + A%2;
            B = B/2 + B%2;
            if((B-A) == 1 && B%2 == 0){
                break;
            }
        }
        System.out.println(answer);
    }
}