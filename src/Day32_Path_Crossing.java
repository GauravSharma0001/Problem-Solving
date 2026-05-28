//1496. Path Crossing
//Given a string path, where path[i] = 'N', 'S', 'E' or 'W', each representing moving one unit north, south, east, or west, respectively. You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.
//Return true if the path crosses itself at any point, that is, if at any time you are on a location you have previously visited. Return false otherwise.

import java.util.HashSet;
import java.util.Set;

public class Day32_Path_Crossing {
    public static void main(String[] args) {
        String path = "NESWW";
        System.out.println(isPathCrossing(path));
    }
    public static boolean isPathCrossing(String path) {
        Set<String> set = new HashSet<>();
        set.add("0,0");
        int x=0;
        int y=0;
        for(char c:path.toCharArray()){
            switch(c){
                case 'N'-> y++;
                case 'S'-> y--;
                case 'E'-> x++;
                case 'W'-> x--;
            }
            if(set.contains(x+","+y)){
                return true;
            }
            set.add(x+","+y);
        }
        return false;
    }
}
