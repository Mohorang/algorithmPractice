import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);

        int count = 0;

        for (int k = 0; k < n; k++) {
            long find = a[k];
            int i = 0;
            int j = n-1;
            while(i < j){
                if(a[i] + a[j] == find){
                    if(i != k && j != k){
                        count++;
                        break;
                    }
                    else if(i == k){
                        i++;
                    }
                    else if(j == k){
                        j--;
                    }
                }
                else if(a[i] + a[j] < find){
                    i++;

                }
                else{
                    j--;
                }
            }
        }
        System.out.println(count);
    }
}
