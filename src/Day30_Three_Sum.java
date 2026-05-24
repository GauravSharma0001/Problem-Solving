//15. 3Sum
//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

import java.util.*;

public class Day30_Three_Sum {
    public static void main(String[] args) {
    int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res= new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            Set<Integer> set = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int third = -(nums[i]+nums[j]);
                if (set.contains(third)){
                    res.add(Arrays.asList(nums[i],third,nums[j]));
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(res);
    }
}
