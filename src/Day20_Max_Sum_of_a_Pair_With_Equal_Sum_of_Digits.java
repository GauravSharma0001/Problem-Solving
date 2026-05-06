//2342. Max Sum of a Pair With Equal Sum of Digits
//You are given a 0-indexed array nums consisting of positive integers. You can choose two indices i and j, such that i != j, and the sum of digits of the number nums[i] is equal to that of nums[j].
//Return the maximum value of nums[i] + nums[j] that you can obtain over all possible indices i and j that satisfy the conditions. If no such pair of indices exists, return -1.

import java.util.HashMap;
import java.util.Map;

public class Day20_Max_Sum_of_a_Pair_With_Equal_Sum_of_Digits {
    public static void main(String[] args) {
        int[] arr={18,43,36,13,7};
        System.out.println(maximumSum(arr));
    }
    public static int maximumSum(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        int res=-1;
        for(int i=0;i<nums.length;i++){
            int s=sum(nums[i]);
            if(map.containsKey(s)){
                res=Math.max(res,nums[i]+map.get(s));
                if(nums[i]>map.get(s)){
                    map.put(s,nums[i]);
                }
            }
            else{
                map.put(s,nums[i]);
            }
        }
        return res;
    }
    public static int sum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}
