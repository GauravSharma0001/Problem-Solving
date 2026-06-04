//1394. Find Lucky Integer in an Array
//Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
//Return the largest lucky integer in the array. If there is no lucky integer return -1.

import java.util.HashMap;
import java.util.Map;

public class Day35_Find_Lucky_Integer_in_an_Array {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,3};
        System.out.println(findLucky(arr));
    }
    public static int findLucky(int[] arr) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int num: arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int res=map.keySet()
                .stream()
                .filter(num->map.get(num).equals(num))
                .max(Integer::compareTo)
                .orElse(-1);
        return res;
    }
}