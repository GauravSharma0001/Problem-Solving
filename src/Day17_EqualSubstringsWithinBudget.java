//1208. Get Equal Substrings Within Budget
//You are given two strings s and t of the same length and an integer maxCost.
//You want to change s to t. Changing the ith character of s to ith character of t costs |s[i] - t[i]| (i.e., the absolute difference between the ASCII values of the characters).
//Return the maximum length of a substring of s that can be changed to be the same as the corresponding substring of t with a cost less than or equal to maxCost. If there is no substring from s that can be changed to its corresponding substring from t, return 0.

public class Day17_EqualSubstringsWithinBudget {
    public static void main(String[] args) {
        String s="abcd";
        String t="bcdf";
        int maxCost=3;
        System.out.println(equalSubstring(s,t,maxCost));

    }
    public static int equalSubstring(String s, String t, int maxCost) {
        int n=s.length();
        int res=0;
        int l=0;
        int diff=0;
        for(int r=0; r<n;r++){
            diff+=Math.abs(s.charAt(r)-t.charAt(r));
            while(diff>maxCost){
                diff-=Math.abs(s.charAt(l)-t.charAt(l));
                l++;
            }
            res=Math.max(res,r-l+1);
        }
        return res;
    }
}
