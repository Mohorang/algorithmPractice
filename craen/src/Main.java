import java.util.Stack;

public class Main {
    public static  void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        System.out.println(solution(board, moves));
    }
    public static int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    if (stack.empty()) {
                        stack.push(board[j][moves[i] - 1]);
                    } else {
                        if (stack.peek() != board[j][moves[i] - 1]) {
                            stack.push(board[j][moves[i] - 1]);
                        } else {
                            stack.pop();
                            answer += 2;
                        }
                    }
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }

        }
        return answer;
    }
}
