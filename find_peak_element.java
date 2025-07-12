class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;         // Length of the array
        int left = 0;                // Left boundary of search
        int right = n - 1;           // Right boundary of search

        while (left < right) {       // Binary search loop
            int mid = (left + right) / 2;

            // Compare mid element with its right neighbor
            if (nums[mid] > nums[mid + 1]) {
                // If current element is greater than the next,
                // then the peak lies on the left half (including mid)
                right = mid;
            } else {
                // If current element is less than the next,
                // the peak lies on the right half (excluding mid)
                left = mid + 1;
            }
        }

        // When left == right, it points to a peak element
        return right;
    }
}
