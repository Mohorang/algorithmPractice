import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int answer = 0;
        int[] priorities = new int[]{1, 1, 9, 1, 1, 1};
        int location = 0;
        //역순으로 정렬
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        //큐에 데이터 add
        for (int priority : priorities) {
            queue.add(priority);
        }
        //큐가 텅 빌때까지
        while (!queue.isEmpty()) {
            //주어진 수의 사이즈만큼 for문
            for (int i = 0; i < priorities.length; i++) {
                //[9,1,1,1,1,1]로 정렬된 상태에서 생각하자
                //peek의 숫자와 같지만 location과는 같지 않으니 answer만 증가
                //i가 3,4,5증가해도 peek의 값과 같지만 location 과 같지 않아서 끝나지는 않는다.
                //i=0부터 다시 돌기 시작할 때 location과 i가 같은 구간에서 answer가 출력된다.
                if (queue.peek() == priorities[i]) {
                    queue.poll();
                    answer++;
                    if (location == i) break;
                }
            }
        }

    }
}