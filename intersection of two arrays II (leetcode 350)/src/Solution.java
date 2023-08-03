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
            if(l[i]<=r[j])
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
    public static int[] intersect(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int a[];
        mergesort(nums1,0,nums1.length-1);
        mergesort(nums2,0,nums2.length-1);
        List <Integer> list=new ArrayList<Integer>();
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]==nums2[j])
            {
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j])
                j++;
            else
                i++;
        }
        a=new int[list.size()];
        i=0;
        for (int num: list)
        {
            a[i++]=num;
        }
        return a;
    }
	public static void main(String[] args) {
		int [] nums1 = {1,2,2,1}; 
		int [] nums2 = {2,2};
		System.out.println(Arrays.toString(intersect(nums1,nums2)));
	}

}
