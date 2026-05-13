//2248. Intersection of Multiple Arrays
//Given a 2D integer array nums where nums[i] is a non-empty array of distinct positive integers, return the list of integers that are present in each array of nums sorted in ascending order.

import java.util.*;

public class Day25_Intersection_of_Multiple_Arrays {
    public static void main(String args[]){
        int[][] nums ={{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        System.out.println(intersection(nums));
    }
    public static List<Integer> intersection(int[][] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<nums.length;i++){
            for(int j:nums[i]){
                map.put(j,map.getOrDefault(j,0)+1);
            }
        }
        for(int k:map.keySet()){
            if(map.get(k)==nums.length){
                arr.add(k);
            }
        }
        Collections.sort(arr);
        return arr;
    }
}
