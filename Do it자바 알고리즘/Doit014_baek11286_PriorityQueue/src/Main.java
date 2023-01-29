import java.util.PriorityQueue;
import java.util.Scanner;

//절대값 힙 구현하기 문제 queue를 활용
//절대값이 작은수가 front
//같은 수일때는 작은수를 front로 정렬
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        PriorityQueue<Integer> queue = new PriorityQueue<>(((o1, o2) -> {
            int a = Math.abs(o1);
            int b = Math.abs(o2);
            //절대값이 같으면 숫자가 작은거를 앞으로 오게끔
            if(a==b){
                return o1<o2 ? -1 : 1;
            }
            else return a-b; // a<b return -1
        }));

        for (int i = 0; i < N; i++) {
            int request = sc.nextInt();
            if(request ==0){
                if(queue.isEmpty()){
                    System.out.println("0");
                }
                else System.out.println(queue.poll());
            }
            else {
                queue.add(request);
            }
        }
    }
}