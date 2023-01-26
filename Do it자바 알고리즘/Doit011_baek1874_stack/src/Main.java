import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuffer bf = new StringBuffer();
        boolean result = true;

        int num = 1;
        for (int i = 0; i < n; i++) {
            if(A[i]>=num){
                while(A[i] >= num){
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }
            else if(A[i] < num){
                int pop = stack.pop();

                if(A[i] > pop){
                    System.out.println("NO");
                    result = false;
                    break;
                }
                else{
                    bf.append("-\n");
                }
            }

        }

        if(result) System.out.println(bf.toString());

    }
}
