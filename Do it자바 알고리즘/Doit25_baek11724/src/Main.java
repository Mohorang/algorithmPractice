import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //입력받는 노드개수 N과 엣지 개수 M입력
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        visited = new boolean[n+1];
        A = new ArrayList[n+1];

        //인접 리스트 초기화하기
        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }
        //인접리스트 배열 채워넣기
        for (int i = 1; i <= m ; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            A[a].add(b);
            A[b].add(a);
        }
        //결과 변수 설정
        int count=0;

        for (int i = 1; i <= n; i++) {
            //방문배열이 채워져 있지 않다면 DFS실행하기
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }
    //재귀함수로 DFS구현
    private static void DFS(int i) {
        //방문 이력이 있다면 return
        if(visited[i]) return;
        visited[i] = true;
        //방문 이력이 없다면 인접리스트 탐색해서 DFS 재귀함수 실행
        for (Integer a : A[i]) {
                DFS(a);
        }
    }

}