import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 1;
        int start_index =1;
        int end_index = 1;
        int count = 1;
        int NUM = sc.nextInt();
        //경우의 수는 3가지
        // sum이 NUM과 같을때 클때 작을때
        while(end_index != NUM){
            if(sum == NUM){
                count++;
                end_index++;
                sum += end_index;
            }else if(sum > NUM){
                sum -= start_index;
                start_index++;
            }
            else {
                end_index++;
                sum += end_index;
            }
        }
        System.out.println(count);
    }
}
