//451. Sort Characters By Frequency
//Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day37_Sort_Characters_By_Frequency {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
    public static String frequencySort(String s) {
        Map<Character,Integer> map= new HashMap<>();
        List<Character>[] arr = new ArrayList[s.length()+1];
        StringBuilder sb = new StringBuilder();
        for(Character c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        map.keySet().forEach(
                c-> {
                    if(arr[map.get(c)]==null){
                        arr[map.get(c)]= new ArrayList();
                    }
                    arr[map.get(c)].add(c);
                }
        );
        for(int n=arr.length-1;n>0;n--){
            if(arr[n]!=null){
                for(Character c:arr[n]){
                    for(int j=0;j<n;j++){
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
}
