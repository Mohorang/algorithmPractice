import java.util.Scanner;

/**
 * 세개의 수를 이용해서 몇년이 지났는지 구하는 문제
 * 주어지는 입력으로는 e,s,m이 있는데
 * e의 범위는 1~15 , s는 1~28 , m 은 1~19까지이다.
 * ex) 1,2,3이 주어졋을때 이때의 년도는 5266년
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int e = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();
        int a=0 , b=0 , c=0;
        int result = 0;
        while(true){
            result++;
            a += 1;
            b += 1;
            c += 1;
            if(a == 16){
                a=1;
            }
            if(b == 29){
                b =1;
            }
            if( c == 20){
                c = 1;
            }
            if(a==e && b==s && c==m){
                break;
            }

        }

        System.out.println(result);
    }
}