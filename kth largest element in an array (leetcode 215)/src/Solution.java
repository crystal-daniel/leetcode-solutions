import java.util.*;
public class Solution {
	public static void mergesort(int [] a,int low, int high)
    {
        int mid;
        if(low<high)
        {
            mid=(low+high)/2;
            mergesort(a,low,mid);
            mergesort(a,mid+1,high);
            merge(a,low,mid,high);
        }
    }
    public static void merge(int [] a, int low, int mid, int high)
    {
        int i,j,k;
        int n1=mid-low+1;
        int n2=high-mid;
        int [] l = new int[n1];
        int [] r = new int[n2];
        for (i = 0; i < n1; i++) {
            l[i] = a[low+i];
        }
        for (j = 0; j < n2; j++) {
            r[j] = a[mid+1+j];
        }
        i=0;
        j=0;
        k=low;
        while(i<n1 && j<n2)
        {
            if(l[i]>=r[j])
            {
                a[k]=l[i];
                i++;
            }
            else
            {
                a[k]=r[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            a[k]=l[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            a[k]=r[j];
            j++;
            k++;
        }
    }
    public static int findKthLargest(int[] nums, int k) {
        mergesort(nums,0,nums.length-1);
        List <Integer> list = new ArrayList<Integer>();
        int i = 0;
        while(list.size()<k && i<nums.length)
        {
            list.add(nums[i]);
            i++;
        }
        if(list.size()==k)
            return list.get(k-1);
        return nums[0];
    }
	public static void main(String[] args) {
		int [] nums = {3,2,3,1,2,4,5,5,6}; 
		int k = 4;
		System.out.println(findKthLargest(nums, k));
	}
}
