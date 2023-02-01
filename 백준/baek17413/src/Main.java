import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        //공백은 구분하고
        //태그는 뒤집지 말것
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        boolean reverse = true;

        //1. 공백을 만났을 떄
        //2. '<' '>' 를 만났을때
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '<'){
                reverse = false;
                while(!stack1.isEmpty()){
                    System.out.print(stack1.pop());
                }
            }
            else if(c == '>'){
                System.out.print(c);
                reverse = true;
                continue;
            }

            if(reverse && (c == ' ' || i == s.length()-1)){
                if(i == s.length()-1){
                    stack1.push(s.charAt(i));
                }
                while(!stack1.isEmpty()){
                    System.out.print(stack1.pop());
                }
                System.out.print(" ");
            }
            else if(!reverse){
                System.out.print(c);
            }
            else stack1.push(c);
        }
    }
}
