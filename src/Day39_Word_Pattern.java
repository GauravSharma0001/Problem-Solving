//290. Word Pattern
//Given a pattern and a string s, find if s follows the same pattern.
//Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

import java.util.HashMap;
import java.util.Map;

public class Day39_Word_Pattern {
    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";
        System.out.println(wordPattern(pattern,s));
    }

    public static boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<>();
        String[] arr = s.split(" ");
        if(arr.length!=pattern.length()){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char cp= pattern.charAt(i);
            String ss= arr[i];
            if(map.containsKey(cp) && !map.get(cp).equals(ss) || !map.containsKey(cp) && map.values().contains(ss)){
                return false;
            }
            map.put(cp,ss);
        }
        return true;
    }
}
