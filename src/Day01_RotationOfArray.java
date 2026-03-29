import java.util.Arrays;
import java.util.List;

public class Day01_RotationOfArray {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2,3,5,6,7);
        left_rotate(arr,5,2);
        System.out.println(arr);
    }

    public static void left_rotate(List<Integer> list, int n , int d){
        rev(list,0,d-1);
        rev(list,d,n-1);
        rev(list,0,n-1);
    }

    public static void rev(List<Integer> list, int i, int j){
        while(i<j) {
            Integer temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
}
