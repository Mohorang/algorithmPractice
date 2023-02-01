import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = bf.readLine();

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            stack1.push(s.charAt(i));
        }

        int a = Integer.parseInt(bf.readLine());

        for (int i = 0; i < a; i++) {
            String c = bf.readLine();
            if(!stack1.isEmpty() && c.equals("L")){
                stack2.push(stack1.pop());
            }
            else if( !stack2.isEmpty() && c.equals("D")){
                stack1.push(stack2.pop());
            }
            else if(!stack1.isEmpty() && c.equals("B") ){
                stack1.pop();
            }
            else if(c.charAt(0) == 'P'){
                char d = c.charAt(2);
                stack1.push(d);
            }
        }
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        while(!stack2.isEmpty()){
            bw.write(stack2.pop());
        }

        bw.flush();
        bw.close();
    }
}
