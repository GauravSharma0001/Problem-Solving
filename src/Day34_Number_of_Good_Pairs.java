//1512. Number of Good Pairs
//Given an array of integers nums, return the number of good pairs.
//A pair (i, j) is called good if nums[i] == nums[j] and i < j.

import java.util.HashMap;
import java.util.Map;

public class Day34_Number_of_Good_Pairs {

    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int res=0;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int n:map.keySet()){
            int m=map.getOrDefault(n,0);
            if(m>1){
                res+=m*(m-1)/2;
            }
        }
        return res;
    }
}
