//2351. First Letter to Appear Twice
//Given a string s consisting of lowercase English letters, return the first letter to appear twice.

import java.util.HashSet;
import java.util.Set;

public class Day18_First_Letter_to_Appear_Twice {
    public static void main(String[] args) {
        String s="abccbaacz";
        System.out.println(repeatedCharacter(s));
    }
    public static char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }
            else{
                return s.charAt(i);
            }
        }
        return '\0';
    }
}
