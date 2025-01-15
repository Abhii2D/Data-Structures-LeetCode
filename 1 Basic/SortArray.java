import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray {

    ///  Insertion Sorting Algorithm

    static void decending(int [] arr){
        int temp ,j;
        for(int i = 1;i<=arr.length-1;i++){
            temp = arr[i];
            j = i;
            while (j>0 && temp > arr[j-1]){
                arr[j]= arr[j-1];
                j--;
            }
            arr[j]= temp;
        }
        display(arr);
    }

    static void accending(int [] arr){
        int temp ,j;
        for(int i = 1;i<=arr.length-1;i++){
            temp = arr[i];
            j = i;
            while (j>0 && temp < arr[j-1]){
                arr[j]= arr[j-1];
                j--;
            }
            arr[j]= temp;
        }
        display(arr);
    }

    static void display(int []arr){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int [] arr={9,3,5,2};
        decending(arr);
        accending(arr);
    }
}
