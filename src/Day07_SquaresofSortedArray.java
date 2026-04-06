//977. Squares of a Sorted Array
//Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
//Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?

import java.util.Arrays;

public class Day07_SquaresofSortedArray {
    public static void main(String[] args) {
        int[] res = sortedSquares(new int[]{-7,-3,2,3,11});
        System.out.println(Arrays.toString(res));
    }
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int l = 0 , r = n-1;
        int[] res = new int[n];
        int k = n-1;
        while(l<=r){
            int square_l=nums[l]*nums[l];
            int square_r=nums[r]*nums[r];
            if(square_r>square_l){
                res[k]=square_r;
                r--;
            }else {
                res[k] = square_l;
                l++;
            }
            k--;
        }
        return res;
    }
}
