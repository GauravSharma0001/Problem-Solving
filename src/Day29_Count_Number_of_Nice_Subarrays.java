//1248. Count Number of Nice Subarrays
//Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.

import java.util.HashMap;
import java.util.Map;

public class Day29_Count_Number_of_Nice_Subarrays {
    public static void main(String[] args) {
        int[] nums ={1,1,2,1,1};
        int k=3;
        System.out.println(numberOfSubarrays(nums,k));
    }
    public static int numberOfSubarrays(int[] nums, int k) {
        int count=0;
        int res=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num: nums){
            count+=num%2;
            res+=map.getOrDefault(count-k,0);
            map.put(count,map.getOrDefault(count,0)+1);
        }
        return res;
    }
}
