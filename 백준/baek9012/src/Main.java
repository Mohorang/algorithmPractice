//입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다.

//          입력예
//          6
//        (())())
//        (((()())()
//        (()())((()))
//        ((()()(()))(((())))()
//        ()()()()(()()())()
//        (()((())()(

//        출력예
//        NO
//        NO
//        YES
//        NO
//        YES
//        NO

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c == '('){
                    stack.push(c);
                }

                else if(stack.empty()){
                    stack.push(c);
                    break;
                }

                else {
                    stack.pop();
                }
            }
            //스택이 텅 비었으면 문제없음
            if(stack.isEmpty()){
                System.out.println("YES");
            }
            //그 외에는 실패
            else{
                System.out.println("NO");
            }
            stack.clear();
        }
    }
}
