import java.util.Scanner;
import java.util.Stack;

//풀이

/**
 * ()이 만들어진 곳은 레이저이다.
 * 즉 연속으로 ( 이 나오는곳이 막대기의 개수라고 할 수 있다.
 * ( 이 나올때에는 stack에 push를 해주다가 레이저가 나오면 스택의 개수만큼 결과치를 올려주고 pop하기
 * 막대기가 끝날때에는 1개만 개수를 올려준다. 막대기가 끝나는 구별은 반복문의 i-1에 있는 문자가 )이면 막대기이다.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> stack = new Stack<>();
        int lazer = 0;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ')'){
                stack.pop();
                if(s.charAt(i-1) == '('){
                    result += stack.size();
                }
                else{
                    //막대기 끝부분일때
                    result++;
                }
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        System.out.println(result);
    }
}
