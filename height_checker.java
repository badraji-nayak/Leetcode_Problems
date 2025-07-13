class Solution {
    public int heightChecker(int[] heights) {
        int expected[] = new int[heights.length];
        
        // Step 1: Copy the heights into a new array 'expected'
        for (int i = 0; i < heights.length; i++) {
            expected[i] = heights[i];
        }

        // Step 2: Sort the 'expected' array to get the correct height order
        Arrays.sort(expected);

        int count = 0;

        // Step 3: Compare the original 'heights' with the sorted 'expected'
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++; // Mismatch found, increment count
            }
        }

        // Step 4: Return how many students are in the wrong position
        return count;
    }
}
