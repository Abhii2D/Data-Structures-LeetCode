package Searching.dsa4BinarySearch;

// Quetion : Find the floor Number from array using BinarySearch?
// Q Find the element which is greatest smaller then target element  let target is 16 then result should 17
// a[]={1,4,6,15,17,19} same as binary search just instead of return -1 do return end;

public class BinSearchProblemFloorNumber {


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
                return  mid + 1;
            }
        }
        return  aa[end];
    }
    public static void main(String[] args) {
        int [] arr = {2,3,6,8,15,17,18,19,20};
        int target = 5;
        System.out.println(Bin(arr,target));




    }
}

