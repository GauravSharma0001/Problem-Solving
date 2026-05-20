//3. Longest Substring Without Repeating Characters
//Given a string s, find the length of the longest substring without duplicate characters.

import java.util.HashSet;
import java.util.Set;

public class Day28_Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int max_len=0;
        int l=0,r=0;
        Set<Character> set = new HashSet<>();
        while(r<s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                max_len=Math.max(max_len,r-l+1);
                r++;
            }
            else{
                set.remove(s.charAt(l));
                l++;
            }
        }
        return max_len;
    }
}