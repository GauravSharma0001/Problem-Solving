//2824. Count Pairs Whose Sum is Less than Target
//Given a 0-indexed integer array nums of length n and an integer target, return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.

import java.util.List;

public class Day04_CountPairs {
    public static void main(String[] args) {
        List<Integer> list = List.of(-1,-3,2,5,3,7,4);
        int target=10;
        int result=countPairs(list,target);
        System.out.println("Total Number of pairs less than "+target+" in given list: "+result);

    }
    public static int countPairs(List<Integer> nums, int target) {
        int count=0, sum=0, l=0, r=l+1;
        int n = nums.size()-1;
        while(l<=n-1){
            while(r<=n){
                sum=nums.get(l)+nums.get(r);
                if(sum<target){
                    count++;
                }
                sum=0;
                r++;
            }
            l++;
        }
        return count;
    }
}


