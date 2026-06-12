//205. Isomorphic Strings
//Given two strings s and t, determine if they are isomorphic.
//Two strings s and t are isomorphic if the characters in s can be replaced to get t.

import java.util.HashMap;
import java.util.Map;

public class Day38_Isomorphic_Strings {
    public static void main(String[] args) {
        String s= "paper", t = "title";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char si=s.charAt(i);
            char ti=t.charAt(i);
            if(map.containsKey(si) && map.get(si)!=ti || !map.containsKey(si) && map.values().contains(ti)){
                return false;
            }
            map.put(si,ti);
        }

        return true;
    }
}
