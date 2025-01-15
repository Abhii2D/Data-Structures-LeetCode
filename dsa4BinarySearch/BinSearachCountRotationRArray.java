package Searching.dsa4BinarySearch;
// Count Roation of array just return pivote + 1;
public class BinSearachCountRotationRArray {

public static int CountPiv(int [] arr){
    int start = 0;
    int end = arr.length-1;
    while (start <= end){
        int mid = start + (end -start)/2;
        if(mid < end && arr[mid] > arr[mid +1]){
            return  mid;
        }
        if (mid > end && arr[mid]< arr[mid - 1]) {
            return mid - 1;
        }
        if(arr[mid]<= arr[mid +1 ]){
            end = mid- 1;
        }else{
            start = mid +1;
        }
    }
    return  -1;
}


    public static void main(String[] args) {
        int [] arr = {4,5,6,7,1,2,3};
        // Finding the Pivote and its Postion
        System.out.println("Position of Pivote : "+CountPiv(arr));
        // Finding Repation of raotated array
        int roatation = CountPiv(arr) + 1;
        System.out.println("The Count Of Roatation :  "+roatation);
}
}
