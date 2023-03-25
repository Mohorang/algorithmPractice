import java.util.*;

public class Main {
    static boolean[][] visited;
    static List<Integer> result;
    static int[][] A;
    static int number = 0;
    static int count=0;
    private static int dx[] = {0,0,1,-1};
    private static int dy[] = {1,-1,0,0};
    private static int nowX = 0;
    private static int nowY = 0;
    static int n;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        A = new int[n][n];
        visited = new boolean[n][n];
        result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                A[i][j] = s.charAt(j) -'0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(!visited[i][j] && A[i][j] == 1){
                    number++;
                    count = 0;
                    DFS(i,j);
                    result.add(count);
                }
            }
        }
        Collections.sort(result);
        System.out.println(number);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
    static void DFS(int x, int y){
        A[x][y] = number;
        visited[x][y] = true;
        count++;
        //좌우위아래 4번 탐색
        for (int i = 0; i < 4; i++) {
            nowX = dx[i] + x;
            nowY = dy[i] + y;
            if(check() && !visited[nowX][nowY] && A[nowX][nowY] == 1){
                visited[nowX][nowY] = true;
                DFS(nowX,nowY);
            }
        }
    }
    static boolean check(){
        return (nowX >=0 && nowX < n && nowY >=0 && nowY < n);
    }
}