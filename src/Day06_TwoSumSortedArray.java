//167. Two Sum II - Input Array Is Sorted
//Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.
//Return the indices of the two numbers index1 and index2, each incremented by one, as an integer array [index1, index2] of length 2.

import java.util.Arrays;

public class Day06_TwoSumSortedArray {
    public static void main(String[] args) {
        int[] res = twoSum(new int[]{1,2,3,4,5,6,7},5);
        System.out.println(Arrays.toString(res));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int l=0, r=numbers.length-1;
        int[] res= new int[2];
        while(l<r){
            int sum = numbers[l]+numbers[r];
            if(sum==target){
                return new int[]{l+1,r+1};
            }
            else if(target>sum){
                l++;
            }
            else{
                r--;
            }
        }
        return new int[]{-1,-1};
    }
}
