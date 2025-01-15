// LeetCode Problem No 26 Removing the Duplicate values from sorted array the values can the 2 or more
// using 2 pointer approach to solve
// first pointer to store unique values in array
// second pointer to Traves the array

// Pseudocode

// 1. Initialize j = 1          (points to the index where the next unique element will go).
// 2. For i = 1 to n - 1                (iterate over the array starting from the second element):
//     a. If arr[i] != arr[j - 1]:           (current element is different from the last unique one)
//         i. Set arr[j] = arr[i]                 (store the unique element at position j).
//         ii. Increment j                            (move to the next position for unique elements).
// 3. Return j as the count of unique elements.           (for(int i = 0;i<j;i++){sout(arr[i])})
// 4. The first j elements of the array now contain all unique values.


class Problem26 {
    public static void main(String[] args) {
       int [] arr = {0,0,1,2,2,2,3,4,5,5};
       int j = 1;
       for(int i = 1;i<arr.length;i++){
        if(arr[i] != arr[j-1]){
            arr[j] = arr[i];
            j++;
        }
       }
        for(int i = 0 ;i<j;i++){
            System.out.println( arr[i]+ " ");
        }
    }
}
