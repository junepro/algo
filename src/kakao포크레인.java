import java.util.Stack;

public class kakao포크레인 {

    public int sol(int board[][], int[] moves) {

        int answer = 0;
        Stack<Integer> s = new Stack<Integer>();
        s.push(0);

        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] != 0) {
                    if (s.peek() == board[j][move - 1]) {
                        s.pop();
                        answer += 2;
                    } else {
                        s.push(board[j][move - 1]);
                    }
                    board[j][move - 1] = 0;
                    break;
                }
            }
        }

        return 0;
    }
}
