//917. Reverse Only Letters
//Given a string s, reverse the string according to the following rules:

//All the characters that are not English letters remain in the same position.
//All the English letters (lowercase or uppercase) should be reversed.
//Return s after reversing it.

public class Day14_Reverse_Only_Letters {
    public static void main(String[] args) {
        String s="ab-cd";
        System.out.println(reverseOnlyLetters(s));
    }
    public static String reverseOnlyLetters(String s) {
        char[] arr= s.toCharArray();
        int n= arr.length;
        int l=0;
        int r=n-1;
        while(l<r){
            if(Character.isLetter(arr[l]) && Character.isLetter(arr[r])){
                char temp = arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
            else if(!Character.isLetter(arr[l])){
                l++;
            }
            else if(!Character.isLetter(arr[r])){
                r--;
            }
        }
        return new String(arr);
    }
}
