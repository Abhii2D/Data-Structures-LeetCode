package Searching.BinarySearch;

public class BinSearchProblem1 {

    public static int Bin(int [] aa , int target){
        int start = 0;
        int end = aa.length-1;
        while (start <= end){
            int mid = start + (end -start)/2;
            if(target < aa[mid]){
                end = mid-1;
            } else if (target > aa[mid]) {
                start = mid +1;
            }else {
                return  mid;
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 7;
        System.out.println(Bin(arr,target));




    }
}