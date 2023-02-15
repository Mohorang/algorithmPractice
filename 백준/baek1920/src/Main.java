import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int key = sc.nextInt();
            System.out.println(binarySearch(a,key));
        }


    }
    public static int binarySearch(int[] arr , int key){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = (low+high)/2;
            if(key < arr[mid]){
                high = mid-1;
            }
            else if(key > arr[mid]){
                low = mid+1;
            }
            else {
                return 1;
            }
        }

        return 0;
    }
}
