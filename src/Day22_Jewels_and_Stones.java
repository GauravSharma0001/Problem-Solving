//771. Jewels and Stones
//You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

import java.util.HashSet;
import java.util.Set;

public class Day22_Jewels_and_Stones {
    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels,stones));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        Set<Character> set= new HashSet<>();
        for(char c: jewels.toCharArray()){
            set.add(c);
        }
        int count=0;
        for(char c: stones.toCharArray()){
            if(set.contains(c)){
                count++;
            }
        }
        return count;
    }
}
