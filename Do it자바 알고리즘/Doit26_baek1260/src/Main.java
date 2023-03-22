import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<Integer>[] A;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 노드 개수
        int M = sc.nextInt(); // 에지 개수
        int start = sc.nextInt();

        A = new ArrayList[N+1];
        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 1; i <= M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            A[a].add(b);
            A[b].add(a);
        }
        for (int i = 1; i <= N; i++) {
            Collections.sort(A[i]);
        }
        visited = new boolean[N+1];
        DFS(start);
        System.out.println();
        visited = new boolean[N+1];
        BFS(start);

    }
    private static void DFS(int node){
        if(visited[node]) return;
        System.out.print(node + " ");
        visited[node] = true;
        for (int i : A[node]) {
            if(!visited[i]){
                DFS(i);
            }
        }
    }
    private static void BFS(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()){
            int now_node = queue.poll();
            System.out.print(now_node + " ");
            for (int i : A[now_node]) {
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }


    }
}