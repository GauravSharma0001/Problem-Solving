//1941. Check if All Characters Have Equal Number of Occurrences
//Given a string s, return true if s is a good string, or false otherwise.
//A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).

import java.util.HashMap;
import java.util.Map;

public class Day23_All_Equal_Number_of_Occurrences {
    public static void main(String[] args) {
        String s = "abacbc";
        System.out.println(areOccurrencesEqual(s));
    }
    public static boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> map= new HashMap<>();
        int count=0;
        for(char c: s.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                map.put(c,map.get(c)+1);
            }
        }
        count=map.get(s.charAt(0));
        for(Integer i: map.values()){
            if(i!=count){
                return false;
            }
        }
        return true;
    }
}
