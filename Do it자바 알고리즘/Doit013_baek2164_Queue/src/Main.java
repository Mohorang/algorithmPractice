//Queue를 사용한 카드게임 문제
// 1~N의 숫자가 주어졋을때 맨 위의 숫자를 버리고 그 다음 위의 숫자를 가장 아래로 옮길때
// 가장 마지막에 남아있는 숫자는 무엇인가?

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            queue.add(i+1);
        }
        //카드가 한장 남을때 까지 반복하기
        while(queue.size()>1){
            queue.poll();
            int a =0;
            if(!queue.isEmpty()){
                a = queue.poll();
                queue.add(a);
            }
        }
        System.out.println(queue.peek());
    }
}
