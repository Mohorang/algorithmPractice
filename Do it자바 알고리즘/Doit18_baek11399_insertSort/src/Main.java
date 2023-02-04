import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int insert_index = i;
            int j = i-1;

            //더 깔끔한 코드
            while(j >=0 && key < a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;

            System.out.println(Arrays.toString(a));
//
//            for (int j = i-1; j >= 0; j--) {
//                if(a[j] > key){
//                    insert_index = j;
//                }
//            }
//            //shift 연산
//            for (int j = i; j >= insert_index+1; j--) {
//                a[j] = a[j-1];
//            }
//
//            a[insert_index] = key;
        }
        System.out.println("result = " + Arrays.toString(a));
    }
}
