//1004. Max Consecutive Ones III

//Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

public class Day11_MaximumConsectutiveOnes3 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int res= longestOnes(nums,k);
        System.out.println(res);
    }
    public static int longestOnes(int[] nums, int k) {
        int sum=0;
        int l=0;
        int ans=0;
        for(int r=0; r<=nums.length-1;r++){
            sum+=nums[r];
            while(sum+k<r-l+1){
                sum-=nums[l];
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}
