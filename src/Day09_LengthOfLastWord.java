//58. Length of Last Word
//Given a string s consisting of words and spaces, return the length of the last word in the string.
//A word is a maximal substring consisting of non-space characters only.

public class Day09_LengthOfLastWord {
    public static void main(String[] args) {
        int res=lengthOfLastWord("Hello World _");
        System.out.println("Last word length is: "+res);
    }
    public static int lengthOfLastWord(String s) {
        char[] arr = s.toCharArray();
        int r = arr.length-1;
        int count = 0;
        while(r>=0){
            int ch= (int) arr[r];
            if(Character.isLetter(ch)){
                count++;
            }
            else if(count!=0){
                return count;
            }
            r--;
        }
        return count;
    }
}
