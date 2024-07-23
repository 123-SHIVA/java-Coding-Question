package LinearSearch.LeetCodeque;

// https://leetcode.com/problems/richest-customer-wealth/description/

public class Que2 {
    public static void main(String[] args) {

        int accounts[][] = { { 1, 2, 3 }, { 3, 2, 1 } };
        System.out.println(maximumWealth(accounts));

    }

    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;

        for (int[] account : accounts) {
            // when we start here take a new sum for every row
            int sum = 0;
            for (int ints : account) {
                sum += ints;
            }
            // now we have sum of accounts of person
            // check with overAll answers
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
