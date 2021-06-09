import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class Solution {

    public int solution(int[][] board, int[] moves) {

        int answer=0;

        Stack<Integer> stack = new Stack<>();
        stack.push(0); //맨위값 비교해야되는데 데이터업스면 오류뜨기때문

        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] != 0) {
                    if (stack.peek() == board[j][move - 1]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[j][move - 1]);
                    }

                    board[j][move-1]=0;
                    break;
                }
            }

        }

        return answer;
    }
}
