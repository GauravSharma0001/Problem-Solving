//209. Minimum Size Subarray Sum
//Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

public class Day16_Minimum_Size_Subarray_Sum {
    public static void main(String[] args) {
        int[] nums={2,3,1,2,4,3};
        int target=7;
        System.out.println(minSubArrayLen(target,nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int sum=0;
        int n=nums.length;
        int minLen=Integer.MAX_VALUE;
        for(int r=0;r<n;r++){
            sum+=nums[r];
            while(sum>=target){
                minLen=Math.min(minLen,r-l+1);
                sum-=nums[l++];
            }
        }
        return minLen==Integer.MAX_VALUE?0:minLen;
    }
}
