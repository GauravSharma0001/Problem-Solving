//1695. Maximum Erasure Value
//You are given an array of positive integers nums and want to erase a subarray containing unique elements. The score you get by erasing the subarray is equal to the sum of its elements.
//Return the maximum score you can get by erasing exactly one subarray.

import java.util.HashSet;
import java.util.Set;

public class Day42_Maximum_Erasure_Value {
    public static void main(String[] args) {
        int[] nums ={5,2,1,2,5,2,1,2,5};
        System.out.println(maximumUniqueSubarray(nums));
    }
    public static int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int l=0;
        int sum=0, max_sum=0;
        for(int r=0; r<nums.length; r++){
            while(set.contains(nums[r])){
                set.remove(nums[l]);
                sum-=nums[l];
                l++;
            }
            set.add(nums[r]);
            sum +=nums[r];
            max_sum= Math.max(sum,max_sum);
        }
        return max_sum;
    }
}
