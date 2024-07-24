package LinearSearch.LeetCodeque;

import java.util.Arrays;

// https://leetcode.com/problems/running-sum-of-1d-array/submissions/1332003183/
public class Que3 {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int res[] = runningSum(arr);
        System.out.println(Arrays.toString(res));
    }

    static int[] runningSum(int arr[]) {
        int resultantArr[] = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            resultantArr[i] = sum;
        }

        return resultantArr;
    }
}
