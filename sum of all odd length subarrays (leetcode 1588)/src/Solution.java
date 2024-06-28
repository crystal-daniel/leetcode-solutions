
public class Solution {
	public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0, start = 0, end = 0, len = arr.length;
        for(int i=0;i<len;i++)
        {
            start = len - i;
            end = i+1;
            int totalSubarray = start * end;
            totalSubarray = totalSubarray%2==0 ? totalSubarray/2 : totalSubarray/2 + 1;
            sum += totalSubarray*arr[i];
        }
        return sum;
    }
	public static void main(String[] args) {
		int [] arr = {1,4,2,5,3};
		System.out.print(sumOddLengthSubarrays(arr));
	}
}
