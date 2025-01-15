package Searching.dsa4BinarySearch;
// Quetion : Find the ceiling Number from array using BinarySearch?
// Q Find the element which is smallest greater then target element  let target is 16 then result should 17
// a[]={1,4,6,15,17,19} same as binary search just instead of return -1 do return start;

public class BinSearchProblemCeilingNumber {


    public static int Bin(int [] aa , int target){
        int start = 0;
        int end = aa.length-1;
        if(target > aa[end]){
             return -1;
        }
        while (start <= end){
            int mid = start + (end -start)/2;
            if(target < aa[mid]){
                end = mid-1;
            } else if (target > aa[mid]) {
                start = mid +1;
            }else {
                return  mid + 1;
            }
        }
        return  aa[start];
    }
    public static void main(String[] args) {
        int [] arr = {1,3,6,8,15,17,18,19,20};
        int target = 90;
        System.out.println(Bin(arr,target));




    }
}
