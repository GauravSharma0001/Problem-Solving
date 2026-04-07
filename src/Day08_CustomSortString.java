//You are given two strings order and s. All the characters of order are unique and were sorted in some custom order previously.
//Permute the characters of s so that they match the order that order was sorted. More specifically, if a character x occurs before a character y in order, then x should occur before y in the permuted string.

import java.util.HashSet;
import java.util.Set;

public class Day08_CustomSortString {
    public static void main(String[] args) {
        String order = "cba";
        String s = "abcd";
        String res = customSortString(order,s);
        System.out.println(res);
    }
    public static String customSortString(String order, String s) {
        StringBuffer sb = new StringBuffer();
        Set<Character> set = new HashSet();
        int[] ca = new int[26];
        for(char i: order.toCharArray()){
            set.add(i);
        }
        for(char i: s.toCharArray()){
            if(!set.contains(i)){
                sb.append(i);
            }
            else{
                ca[i-'a']++;
            }
        }
        for(char i: order.toCharArray()){
            int n = ca[i-'a'];
            while(n-->0){
                sb.append(i);
            }
        }
        return sb.toString();
    }
}
