import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if(num == 0){
                stack.pop();
                continue;
            }
            stack.add(num);
        }

        int result =0;

        while(!stack.isEmpty()){
            result+= stack.pop();
        }
        System.out.println(result);

    }
}
