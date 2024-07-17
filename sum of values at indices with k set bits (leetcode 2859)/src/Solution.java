public class Solution {
//	public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
//        int sum = 0, i = 0;
//        for(int n: nums)
//        {
//            String bin = Integer.toBinaryString(i++);
//            int numberOfOnes = bin.length() - (bin.replaceAll("1","").length());
//            if(numberOfOnes == k)
//            {
//                sum += n;
//            }
//        }
//        return sum;
//    }
	public static int sumIndicesWithKSetBits(int [] nums, int k) {
        int sum = 0, i = 0;
        for(int n: nums)
        {
            if(Integer.bitCount(i++) == k)
            {
                sum += n;
            }
        }
        return sum;
    }
	public static void main(String[] args) {
		int nums[] = {5,10,1,5,2}, k = 1;
		System.out.println(sumIndicesWithKSetBits(nums, k));
	}
}
