 import java.util.Scanner;

public class Main {
    static int[] checkArr;
    static int[] myArr;
    static int checkCount = 0;

    //A,C,G,T순서

    /**
     * 문제풀이 순서
     * 1. 문자열길이 S , 부분문자열길이 P , 원본배열A[] , 체크용배열checkArr , 부분배열 myArr , 각 문자별 일치시 카운트가 올라가는 checkCount 선언
     * 2. 선언후 checkArr에다가 입력받은 각 문자별로 최소 몇개씩은 있어야 하는지 입력 , 단 0일때에는 checkCount 1상승
     * 3. 0번째 인덱스부터 부분문자열길이 P까지 for문 돌리면서 체크하기
     * 4. checkCount가 4라면 ( 4개의 문자 모두 최수개수를 만족한다면 ) result가 1상승
     * 5. 배열을 슬라이드 후 첫번째 문자열에서 checkArr과 개수가 같다면 checkCount가 1 하락 , 아니라면 myArr만 1하락
     * 6. P와 S의 차이만큼 반복후 result개수 찾기
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int P = sc.nextInt();
        char[] A = new char[S]; //원본 배열
        checkArr = new int[4];
        myArr = new int[4];
        int result=0;
        A = sc.next().toCharArray();

        for (int i = 0; i < 4; i++) {
            checkArr[i] = sc.nextInt();
            if(checkArr[i] == 0){
                checkCount++;
            }
        }
        for (int i = 0; i < P; i++) {
            add(A[i]);
        }

        if(checkCount == 4){
            result++;
        }

        for (int i = 0; i < S-P; i++) {
            int j = P+i;
            remove(A[i]);
            add(A[j]);
            if(checkCount == 4){
                result++;
            }
        }
        System.out.println(result);
    }

    private static void add(char c){
        switch(c){
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0]){
                    checkCount++;
                }
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1]){
                    checkCount++;
                }
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2]){
                    checkCount++;
                }
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3]){
                    checkCount++;
                }
                break;
        }
    }
    private static void remove(char c){
        switch(c){
            case 'A':
                if(myArr[0] == checkArr[0]){
                    checkCount--;
                }
                myArr[0]--;
                break;
            case 'C':
                if(myArr[1] == checkArr[1]){
                    checkCount--;
                }
                myArr[1]--;
                break;
            case 'G':
                if(myArr[2] == checkArr[2]){
                    checkCount--;
                }
                myArr[2]--;
                break;
            case 'T':
                if(myArr[3] == checkArr[3]){
                    checkCount--;
                }
                myArr[3]--;
                break;
        }

    }
}
