class Solution {
    public int maxArea(int[] height) {
        int start = 0;                        // Pointer at the beginning of array
        int end = height.length - 1;          // Pointer at the end of array
        int maxArea = 0;                      // Store the maximum area

        while (start < end) {
            // Calculate current area
            int current = Math.min(height[start], height[end]) * (end - start);

            // Update maxArea if the current area is larger
            maxArea = Math.max(current, maxArea);

            // Move the pointer pointing to the shorter line
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }

        return maxArea;
    }
}
