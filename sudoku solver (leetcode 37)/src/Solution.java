import java.util.Arrays;

public class Solution {
	boolean solve(char[][] board)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j] == '.')
                {
                    for(char c='1'; c<='9';c++)
                    {
                        if(isValid(board, i, j, c))
                        {
                            board[i][j] = c;
                            if(solve(board))
                            {
                                return true;
                            }
                            else
                            {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    boolean isValid(char[][] board, int row, int col, char c)
    {
        for(int i=0;i<9;i++)
        {
            if(board[i][col] == c) return false;
            if(board[row][i] == c) return false;
            if(board[3*(row/3) + (i/3)][3*(col/3) + (i%3)] == c) return false;
        }
        return true;
    }
	public static void main(String[] args) {
		char[][] board = {
			    {'6', '.', '2', '5', '.', '.', '1', '4', '.'},
			    {'5', '.', '.', '2', '7', '.', '.', '6', '.'},
			    {'.', '.', '7', '6', '1', '.', '.', '9', '.'},
			    {'.', '2', '.', '4', '.', '3', '7', '.', '.'},
			    {'.', '5', '8', '.', '2', '6', '9', '.', '.'},
			    {'.', '4', '.', '.', '.', '1', '.', '2', '6'},
			    {'2', '8', '.', '.', '4', '.', '.', '.', '3'},
			    {'.', '6', '5', '1', '.', '2', '.', '.', '.'},
			    {'4', '.', '9', '.', '.', '.', '8', '.', '2'}};

		Solution obj = new Solution();
		obj.solveSudoku(board);
		for(char[] row: board)
		{
			System.out.println(Arrays.toString(row));
		}
	}
}