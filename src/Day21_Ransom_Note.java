//383. Ransom Note
//Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
//Each letter in magazine can only be used once in ransomNote.

import java.util.HashMap;
import java.util.Map;

public class Day21_Ransom_Note {
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";
        System.out.println(canConstruct(ransomNote,magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c:magazine.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        for(char c:ransomNote.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
            }
            else{
                return false;
            }
        }
        for(int i:map.values()){
            if(i<0){
                return false;
            }
        }
        return true;
    }
}
