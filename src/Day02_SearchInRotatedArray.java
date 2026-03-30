public class Day02_SearchInRotatedArray {

    public static void main(String[] args) {
        System.out.println(Search(new Integer[]{4, 5, 6, 7, 8, 9, 10, 1, 2, 3},0,9,10));
    }

    public static Integer Search(Integer[] arr, Integer l, Integer r, Integer key){
        Integer pivot = getPivot(arr,l,r);
        Integer res = bs(arr,l, pivot,key);
        if(res==-1){
            res = bs(arr,pivot+1,r,key);
        }
        return res;
    }

    public static Integer getPivot(Integer[] arr, Integer l, Integer r){
        while(l<=r) {
            Integer mid = (l + r) / 2;
            if(arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if (arr[mid]>arr[mid+1]) {
                return mid;
            }
            else if (arr[mid]>arr[mid-1]) {
                l=mid+1;
            }
            else {
                r=mid-1;
            }
        }
        return -1;
    }

    public static Integer bs(Integer[] arr, Integer l, Integer r,Integer key){
        while(l<=r){
            Integer mid = (l+r)/2;
            if(arr[mid]==key) {
                return mid;
            }
            else if (arr[mid]<key){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }
}
