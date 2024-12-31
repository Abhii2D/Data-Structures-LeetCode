package Searching.BinarySearch;

// LeetCode Problem No : 34 Find the First and last posible target matching element from sorted array
// using binarySearching

public class binSearchProblem34 {
    public static int [] serarcingFisrtLast(int [] arr, int target){
        int [] ans = {-1,-1};
        int startingPoint = search(arr,target,true);
        int endingPoint = search(arr,target,false);
        ans[0] = startingPoint;
        ans[1]= endingPoint;
        return ans;
    }

     static int search(int [] arr , int target , boolean pointofsearch)
    {
        int ans = 0; // Tempory variable to store potentional answer
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end -start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                ans = mid;
                if(pointofsearch == true){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String args[]){
        int [] arr = {1,2,3,4,4,5,6,6};
        int [] result = serarcingFisrtLast(arr,6);
        for(int i : result){
            System.out.println(i);
        }
    }


}
