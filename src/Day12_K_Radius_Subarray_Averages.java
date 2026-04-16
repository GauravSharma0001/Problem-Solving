//2090. K Radius Subarray Averages
//You are given a 0-indexed array nums of n integers, and an integer k.

//The k-radius average for a subarray of nums centered at some index i with the radius k is the average of all elements in nums between the indices i - k and i + k (inclusive). If there are less than k elements before or after the index i, then the k-radius average is -1.

//Build and return an array avgs of length n where avgs[i] is the k-radius average for the subarray centered at index i.

//The average of x elements is the sum of the x elements divided by x, using integer division. The integer division truncates toward zero, which means losing its fractional part.

import java.util.Arrays;

public class Day12_K_Radius_Subarray_Averages {
    public static void main(String[] args) {
        int[] res= getAverages(new int[]{7,4,3,9,1,8,5,2,6},3);
        System.out.println(Arrays.toString(res));
    }

    public static int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        int[] res= new int[n];
        for(int i=0;i<n;i++){
            res[i]=-1;
        }
        int window=2*k+1;
        if(window>n) return res;
        long sum=0;
        for(int i=0; i<window;i++){
            sum+=nums[i];
        }
        for(int j=k;j<n-k;j++){
            res[j]=(int)(sum/window);
            if(j + k + 1 < n) {
                sum -= nums[j - k];
                sum += nums[j + k + 1];
            }
        }
        return res;
    }

}
