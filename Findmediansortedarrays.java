//package trial;
import java.util.*;

//solution beats 100% users in runtime and 92.04% users in memory usage

//solution should exclude main and class be renamed as Solution

class Problem4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int l1=nums1.length;
        int l2=nums2.length;
        int nums[]=new int[l1+l2];
        int i=0,j=0,k=0;
        while(i<l1 && j<l2)
        {
            if(nums1[i]<nums2[j])
            {
                nums[k++]=nums1[i++];
            }
            else{
                nums[k++]=nums2[j++];
            }
        }
        if(i<l1)
        {
            while(i<l1)
            {
                nums[k++]=nums1[i++];
            }
        }
        if(j<l2)
        {
            while(j<l2)
            {
                nums[k++]=nums2[j++];
            }
        }
        double med;
        /*for(int s=0;s<nums.length;s++)
        {
            System.out.print(nums[s]+" ");
        }*/
        if(nums.length%2==0)
        {
            //System.out.println("here");
            int sum=(nums[Math.abs(nums.length/2)]+nums[Math.abs(nums.length/2)-1]);
            //System.out.println("sum:"+sum);
            med=(sum)/2.0;
        }
        else
        {
            med=(nums[Math.abs(nums.length/2)]);
        }
        return med;
        
    }
    
    
    //exclude main
    public static void main(String args[])
    {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("length of first list");
    	int l1=sc.nextInt();
    	System.out.println("length of second list");
    	int l2=sc.nextInt();
    	int nums1[] =new int[l1];
    	//array1
    	for(int i=0;i<l1;i++)
    	{
    		System.out.println("Enter elements of array1:");
    		nums1[i]=sc.nextInt();
    	}
    	int nums2[] =new int[l2];
    	//array2
    	for(int i=0;i<l2;i++)
    	{
    		System.out.println("Enter elements of array2:");
    		nums2[i]=sc.nextInt();
    	}
    	double median=findMedianSortedArrays(nums1,nums2);
    	System.out.println("median="+median);
    }
}
