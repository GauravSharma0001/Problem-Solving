//485. Max Consecutive Ones
//Given a binary array nums, return the maximum number of consecutive 1's in the array.

public class Day10_MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr ={0,1,1,1,0,0,1,1};
        int res = findMaxConsecutiveOnes(arr);
        System.out.println(res);
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max_ones = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                max_ones=Math.max(count,max_ones);
            }
            else{
                count=0;
            }
        }
        return max_ones;
    }
}
