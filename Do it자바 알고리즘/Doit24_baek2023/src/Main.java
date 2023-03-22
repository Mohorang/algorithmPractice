import java.util.Scanner;

public class Main {
    static int N;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        N = sc.nextInt();
        DFS(2,1);
        DFS(3,1);
        DFS(5,1);
        DFS(7,1);
    }
    private static void DFS(int a,int b){
        if(b == N){
            if(isPrime(a)) {
                System.out.println(a);
            }
            return;
        }
        for (int i = 1; i <= 9; i++) {
            if(!isPrime(a*10 + i)) continue;
            DFS(a*10+i,b+1);
        }
    }

    private static boolean isPrime(int i) {
        for (int j = 2; j < Math.abs(i); j++) {
            if(i%j == 0){
                return false;
            }
        }
        return true;
    }
}