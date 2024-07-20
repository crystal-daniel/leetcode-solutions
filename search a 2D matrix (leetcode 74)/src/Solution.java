public class Solution {
	public static boolean searchMatrix(int[][] matrix, int target) {
        int low = 0, high = matrix.length - 1, row = -1;
        while(low<=high)
        {
            int mid = low + (high - low) / 2;
            if(matrix[mid][0] <= target && matrix[mid][matrix[0].length-1]>=target)
            {
                row = mid;
                break;
            }
            else if(matrix[mid][0] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        if(row == -1)
            return false;
        low = 0; 
        high = matrix[row].length - 1;
        while(low<=high)
        {
            int mid = low + (high - low) / 2;
            if(matrix[row][mid] == target)
                return true;
            else if(matrix[row][mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
    }
	public static void main(String[] args) {
		int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}}, target = 3;
		System.out.println(searchMatrix(matrix, target));
	}
}