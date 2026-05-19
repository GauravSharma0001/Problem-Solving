//560. Subarray Sum Equals K
//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Day27_Subarray_Sum_Equals_K {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int k=3;
        System.out.println(subarraySum(nums,k));
    }

//    Brute-Force approach
//    public static int subarraySum(int[] nums, int k) {
//        int count=0;
//        Arrays.sort(nums);
//        for(int i=0;i<nums.length;i++){
//            int sum=0;
//            for(int j=i;j<nums.length;j++){
//                sum+=nums[j];
//                if(sum==k){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

//  Approach 2: Using HashMap - Time Complexity: O(n)
    public static int subarraySum(int[] nums, int k) {
        int count=0;
        int sum=0;
        Map<Integer,Integer> map= new HashMap<>();
        map.put(0,1);
        for(int i:nums){
            sum+=i;
            count+=map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
