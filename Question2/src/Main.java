import java.util.Arrays;

public class Main {
    static int count=0;
    public static void main(String[] args) {
        int[] coin = new int[]{2,5,3,6};
        int sum = 10;
        System.out.println(solution(sum,coin));
    }
    static int solution(int sum , int[] coin){
        int answer = 0;
        Arrays.sort(coin);
        DFS(coin,0,sum,0);
        answer = count;
        return answer;
    }
    private static void DFS(int[] coin,int index,int target, int sum){
        System.out.println("sum = " + sum + " coin[index] = " + coin[index] + " index = " + index);
        if(sum == target){
            count++;
        }
        else if(sum > target){
        }
        else{
            //i의 시작이 index이면 같은 sum이 나오는 중복된 숫자 조합을 방지할 수 있다.
            for (int i = index; i < coin.length; i++) {
                DFS(coin,i,target,sum + coin[i]);
            }
        }
    }
}