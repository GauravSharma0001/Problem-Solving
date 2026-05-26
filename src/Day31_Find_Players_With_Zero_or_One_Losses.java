//2225. Find Players With Zero or One Losses
//You are given an integer array matches where matches[i] = [winneri, loseri] indicates that the player winneri defeated player loseri in a match.
//Return a list answer of size 2 where:
//answer[0] is a list of all players that have not lost any matches.
//answer[1] is a list of all players that have lost exactly one match.
//The values in the two lists should be returned in increasing order.

import java.util.*;

public class Day31_Find_Players_With_Zero_or_One_Losses {
    public static void main(String[] args) {
        int[][] matches = {{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}};
        System.out.println(findWinners(matches));
    }
    public static List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer,Integer> lost_count = new HashMap<>();
        Set<Integer> players = new TreeSet<>();
        List<Integer> zeroLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();
        for(int[] match: matches){
            players.add(match[0]);
            players.add(match[1]);
            lost_count.put(match[1],lost_count.getOrDefault(match[1],0)+1);
        }
        for(int player: players){
            if(lost_count.getOrDefault(player,0)==0){
                zeroLoss.add(player);
            }
            else if(lost_count.getOrDefault(player,0)==1){
                oneLoss.add(player);
            }
        }
        return Arrays.asList(zeroLoss,oneLoss);
    }
}
