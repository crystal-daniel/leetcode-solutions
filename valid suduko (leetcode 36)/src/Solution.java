import java.util.*;
public class Solution {
	public static boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char ch = board[i][j];
                if(ch != '.')
                {
                    if(!set.add("row"+i+ch) 
                    || !set.add("col"+j+ch) 
                    || !set.add("box"+i/3+j/3+ch))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
	public static void main(String[] args) {
		char[][] board = 
			{
			    {'5','3','.','.','7','.','.','.','.'},
			    {'6','.','.','1','9','5','.','.','.'},
			    {'.','9','8','.','.','.','.','6','.'},
			    {'8','.','.','.','6','.','.','.','3'},
			    {'4','.','.','8','.','3','.','.','1'},
			    {'7','.','.','.','2','.','.','.','6'},
			    {'.','6','.','.','.','.','2','8','.'},
			    {'.','.','.','4','1','9','.','.','5'},
			    {'.','.','.','.','8','.','.','7','9'}
			};
		System.out.println(isValidSudoku(board));
	}
}