package Searching.dsa3LinearSearch;

public class Problem1295 {
    // LeetCode problem 1295
// Find the Number with even NUmber of Digits
    public static void main(String[] args) {

        int[] aa = {12, 333, 2, 2334};
        int count = 0;
        for (int i = 0; i < aa.length; i++) {
            String element = Integer.toString(aa[i]);
            if (element.length() % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

