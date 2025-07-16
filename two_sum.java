class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;                         // start pointer at beginning
        int right = numbers.length - 1;       // end pointer at end

        while (left < right) {
            int sum = numbers[left] + numbers[right]; // sum of two pointers

            if (sum == target) {
                // return 1-based indices as required by the problem
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                // increase the left pointer to get a bigger sum
                left++;
            } else {
                // decrease the right pointer to get a smaller sum
                right--;
            }
        }

        // no solution found (optional, for completeness)
        return new int[]{-1, -1};
    }
}
