import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = 0;
        for (int i = 0; i < a; i++) {
            String s = sc.next();
            if(check(s)){
                result++;
            }
        }
        System.out.println(result);
    }
    public static boolean check(String s){
        boolean[] b = new boolean[26];
        char prev = 0;
        for (int i = 0; i < s.length(); i++) {
            char now = s.charAt(i);
            if(prev != now){
                if(!b[now - 'a']){
                    b[now - 'a'] = true;
                    prev = now;
                }
                else{
                    return false;
                }
            }

            else{
                continue;
            }
        }
        return true;
    }
}