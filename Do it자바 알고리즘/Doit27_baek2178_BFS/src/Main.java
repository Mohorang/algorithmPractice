import java.util.*;
public class Main {

    static int[] dx = new int[]{1,-1,0,0};
    static int[] dy = new int[]{0,0,1,-1};
    static int[][] A;

    static int N,M;
    static boolean[][] visited;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = new int[N][M];

        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String s = sc.next();
            for (int j = 0; j < M; j++) {
                A[i][j] = s.charAt(j)-'0';
            }
        }
        BFS(0,0);
        System.out.println(A[N-1][M-1]);
    }

    static void BFS(int x , int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x,y});
        visited[x][y] = true;
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nowX = now[0] + dx[i];
                int nowY = now[1] + dy[i];
                if(nowX >= 0 && nowY >= 0 && nowX < N && nowY < M){
                    if(A[nowX][nowY] !=0 && !visited[nowX][nowY]){
                        visited[nowX][nowY] = true;
                        A[nowX][nowY] = A[now[0]][now[1]] + 1;
                        queue.add(new int[] {nowX , nowY});
                    }

                }
            }

        }
    }
}