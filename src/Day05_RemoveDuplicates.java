//26. Remove Duplicates from Sorted Array
//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

//Consider the number of unique elements in nums to be k. After removing duplicates, return the number of unique elements k.

//The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.

public class Day05_RemoveDuplicates {

    public static void main(String[] args){
        int[] arr = {2, 2, 2, 3, 3};
        int k = removeDuplicates(arr);

        System.out.println("Unique count: " + k);
        System.out.print("Array after removing duplicates: ");
        for(int i = 0; i < k; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        int n = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[n] = nums[i];
                n++;
            }
        }
        return n;
    }
}