package programmers.모의고사1회;

public class Q2_체육대회 {
    static int maxSum = 0;

    public static void main(String[] args) {
        int[][] arr1 = {
            {40, 10, 10},
            {20, 5, 0},
            {30, 30, 30},
            {70, 0, 70},
            {100, 100, 100}
        };
        int[][] arr2 = {
            {20, 30},
            {30, 20},
            {20, 30}
        };

        System.out.println("Answer 1: " + findMaxSum(arr1)); //210
        System.out.println("Answer 2: " + findMaxSum(arr2)); // 60
    }

    public static int findMaxSum(int[][] arr) {
        int rows = arr.length;
        boolean[] usedRows = new boolean[rows];
        maxSum = 0;
        dfs(arr, 0, usedRows, 0);
        return maxSum;
    }

    private static void dfs(int[][] arr, int col, boolean[] usedRows, int currentSum) {
        int cols = arr[0].length;
        if (col == cols) {
            maxSum = Math.max(maxSum, currentSum);
            return;
        }

        for (int row = 0; row < arr.length; row++) {
            if (!usedRows[row]) {
                usedRows[row] = true;
                dfs(arr, col + 1, usedRows, currentSum + arr[row][col]);
                usedRows[row] = false;
            }
        }
    }
}