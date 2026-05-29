//1748. Sum of Unique Elements
//You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
//Return the sum of all the unique elements of nums.

import java.util.HashMap;
import java.util.Map;

public class Day33_Sum_of_Unique_Elements {
    public static void main(String[] args) {
        int[] nums={1,2,3,2};
        System.out.println(sumOfUnique(nums));
    }
    public static int sumOfUnique(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum=0;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int n:map.keySet()){
            if(map.get(n)==1){
                sum+=n;
            }
        }
        return sum;
    }
}
