//643. Maximum Average Subarray I
//You are given an integer array nums consisting of n elements, and an integer k.
//Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

public class Day13_MaximumAverageSubarray1 {
    public static void main(String[] args) {
        int[] nums= {1,12,-5,-6,50,3};
        int k=4;
        System.out.println(findMaxAverage(nums,k));
    }
    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int l=0;
        long sum=0;
        long max_sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        max_sum=sum;
        for(int i=k;i<n;i++){
            sum-=nums[l];
            sum+=nums[i];
            l++;
            max_sum=Math.max(sum,max_sum);
        }
        return (double) max_sum/k;
    }
}
