package Searching.dsa3LinearSearch;

// LeetCode problem 1672
//  fint customer weath numberical
public class Problem1672 {
    public static void main(String[] args) {

        int[][] aa = {{1, 2, 3}, {3, 2, 3}};

        Rich(aa);
    }

    private static void Rich(int[] []aa) {
        int ans = Integer.MIN_VALUE;
        int[] person = null;
        for(int [] ints: aa){
            int sum = 0;
            for(int j : ints){
                sum +=j;

            }
            if(sum > ans){
                ans = sum;
                person = ints;

            }

        }
        System.out.println(ans);
        System.out.print("Richest customer's wealth array: ");
        for (int wealth : person) {
            System.out.print(wealth + " ");
        }
    }
}