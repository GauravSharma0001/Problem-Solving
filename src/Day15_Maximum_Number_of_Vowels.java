//1456. Maximum Number of Vowels in a Substring of Given Length
//Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

//Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

public class Day15_Maximum_Number_of_Vowels {

    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s,k));
    }

    public static int maxVowels(String s, int k) {
        int l = 0, r = 0, sum = 0, res = 0;
        for (; r < k; r++) {
            sum += isVowel(s.charAt(r));
        }
        res = sum;
        while (r < s.length()) {
            sum -= isVowel(s.charAt(l++));
            sum += isVowel(s.charAt(r++));
            res = Math.max(res, sum);
        }
        return res;
    }

    static int isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
    }
}