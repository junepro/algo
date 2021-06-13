import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class Solution {


    public int sol(int board[][], int[] moves) {

        int answer=0;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);

        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] != 0) {
                    if (stack.peek() == board[j][move - 1]) {
                        stack.pop();
                        answer += 2;

                    }
                }
            }
        }



    }
}
