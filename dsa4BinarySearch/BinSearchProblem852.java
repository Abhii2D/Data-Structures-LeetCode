// Que : Find the Peak index in Mountain array [0,1,2,3,4,3,2,1]  4 is peak element
// We use binary searach 
// array is sorted into two part 1 assending sorted order left side , 2 dessending sorted order in right side
// step 1 check mid > mid +1 if yes start 
    // start searching assesnding order part ( end = mid )
// step 2 check mid < mid + 1 if yes start
    // start searching dessending order part right side ( start = mi + 1)
// step 3 Return start or end; because they are locating same index in array

public class BinSearchProblem852 {


static int MountainPeakElement(int[] arr){
    int start = 0;
    int end = arr.length-1;

    while (start<end){
        int mid = start + (end - start)/2;
        if(arr[mid] > arr[mid + 1]){
            end = mid;
        }else {
            start = mid + 1;
        }

    }
    return start;
}

    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4,5,4,3,1};
        System.out.println(MountainPeakElement(arr));
    }

}
