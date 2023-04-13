import java.util.*;
public class Main {
    static ArrayList<Node>[] A;
    static int[] D;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //노드개수
        int V = sc.nextInt();
        //에지개수
        int E = sc.nextInt();
        //출발노드
        int K = sc.nextInt();
        //인접리스트 초기화
        D = new int[V+1];
        D[K] = 0;
        A = new ArrayList[V+1];
        for (int i = 1; i <= V; i++) {
            if(i!=K){
                D[i] = Integer.MAX_VALUE;
            }
            A[i] = new ArrayList<Node>();
        }
        for (int i = 1; i <= E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            A[u].add(new Node(v,w));
        }
    }
}
class Node{
    int node;
    int w;
    public Node(int node,int w){
        this.node = node;
        this.w = w;
    }

    @Override
    public String toString() {
        return "Node{" +
                "node=" + node +
                ", w=" + w +
                '}';
    }
}