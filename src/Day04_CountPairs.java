//2824. Count Pairs Whose Sum is Less than Target
//Given a 0-indexed integer array nums of length n and an integer target, return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day04_CountPairs {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(-1,-3,2,5,3,7,4));
        int target=10;
        int result=countPairs(list,target);
        System.out.println("Total Number of pairs less than "+target+" in given list: "+result);

    }
    public static int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count=0;
        int l=0;
        int r=nums.size()-1;
        while(l<r){
            int sum=nums.get(l)+nums.get(r);
            if(sum<target){
                count+=r-l;
                l++;
            }
            else{
                r--;
            }
        }
        return count;
    }
}