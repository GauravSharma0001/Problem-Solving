//930. Binary Subarrays With Sum
//Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.

import java.util.HashMap;
import java.util.Map;

public class Day36_Binary_Subarrays_With_Sum {
    public static void main(String[] args) {
        int[] nums={1,0,1,0,1};
        int goal=2;
        System.out.println(numSubarraysWithSum(nums,goal));
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
        int count=0;
        int sum=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            count+=map.getOrDefault(sum-goal,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
