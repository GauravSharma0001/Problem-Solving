//1189. Maximum Number of Balloons
//Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
//You can use each character in text at most once. Return the maximum number of instances that can be formed.

import java.util.HashMap;
import java.util.Map;

public class Day26_Maximum_Number_of_Balloons {
    public static void main(String[] args) {
        String text="loonbalxballpoon";
        System.out.println(maxNumberOfBalloons(text));
    }
    public static int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c: text.toCharArray()){
            if(c=='b'|c=='a'|c=='l'|c=='o'|c=='n'){
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        int x=Math.min(map.getOrDefault('b',0),Math.min(map.getOrDefault('a',0),map.getOrDefault('n',0)));
        int xx=Math.min(map.getOrDefault('l',0),map.getOrDefault('o',0));
        return Math.min(xx/2,x);
    }
}
