//2260. Minimum Consecutive Cards to Pick Up
//You are given an integer array cards where cards[i] represents the value of the ith card. A pair of cards are matching if the cards have the same value.
//Return the minimum number of consecutive cards you have to pick up to have a pair of matching cards among the picked cards. If it is impossible to have matching cards, return -1.

import java.util.HashMap;
import java.util.Map;

public class Day19_Minimum_Consecutive_Cards_to_Pick_Up {
    public static void main(String[] args) {
        int[] cards = {3,4,2,3,4,7};
        System.out.println(minimumCardPickup(cards))    ;
    }
    public static int minimumCardPickup(int[] cards) {
        int res=Integer.MAX_VALUE;
        Map<Integer,Integer> map = new HashMap();
        for(int i=0;i<cards.length;i++){
            if(map.containsKey(cards[i])){
                res=Math.min(res,i-map.get(cards[i])+1);
            }
            map.put(cards[i],i);
        }
        return res==Integer.MAX_VALUE?-1:res;
    }
}
