class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int size = grid.length;                         // Size of the grid (n)
        int freq[] = new int[size * size + 1];          // Frequency array from 0 to n^2
        int res[] = new int[2];                         // Result array: [repeated, missing]

        // Step 1: Count frequency of each value in the grid
        for (int row[] : grid) {
            for (int val : row) {
                freq[val]++;
            }
        }

        // Step 2: Identify repeated and missing numbers
        for (int i = 1; i < freq.length; i++) {         // i starts from 1 (since 0 is not valid)
            if (freq[i] == 2) {
                res[0] = i;                             // Repeated number
            } else if (freq[i] == 0) {
                res[1] = i;                             // Missing number
            }
        }

        return res;
    }
}
