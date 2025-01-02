package Searching.Linear;

public class GrestedInUnSorted {

    public  static int Great(int [] arr){
        int ans = arr[0];
        for(int i = 0;i<=arr.length-1;i++){
            if(ans < arr[i]){
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
int [] arr = {2,3,111,4,8,32};
        System.out.println(Great(arr));
    }
}
