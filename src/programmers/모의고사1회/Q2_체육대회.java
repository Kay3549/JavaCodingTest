package programmers.모의고사1회;

public class Q2_체육대회 {

    public static void main(String[] args) throws Exception {

        int[][] arr = {
            {20,30},
            {30,20},
            {20,30}  
        };

        int maxSum = findMaxSum(arr);
        System.out.println("Maximum Sum: " + maxSum); 

    }

    public static int findMaxSum(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        return backtrack(arr, new boolean[rows], new boolean[cols], cols, 0);
    }

    private static int backtrack(int[][] arr, boolean[] usedRows, boolean[] usedCols, int count, int currentSum) {
        // Base case: if 3 numbers are selected, return the current sum
        if (count == 0) {
            return currentSum;
        }

        int maxSum = 0;

        // Iterate through all rows and columns
        for (int i = 0; i < arr.length; i++) {
            if (usedRows[i]) continue; // Skip used rows
            for (int j = 0; j < arr[0].length; j++) {
                if (usedCols[j]) continue; // Skip used columns

                // Mark this row and column as used
                usedRows[i] = true;
                usedCols[j] = true;

                // Recursively explore the next selection
                int sum = backtrack(arr, usedRows, usedCols, count - 1, currentSum + arr[i][j]);

                // Update the maximum sum
                if (sum > maxSum) {
                    maxSum = sum;
                }

                // Backtrack: unmark this row and column
                usedRows[i] = false;
                usedCols[j] = false;
            }
        }

        return maxSum;
    }


}
