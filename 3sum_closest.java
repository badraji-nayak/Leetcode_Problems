class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Step 1: Sort the array

        // Step 2: Initialize closest sum with the first 3 numbers
        int closesum = nums[0] + nums[1] + nums[2];

        // Step 3: Loop through each element
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1;
            int end = nums.length - 1;

            // Step 4: Use two-pointer technique to find best pair with nums[i]
            while (start < end) {
                int currsum = nums[i] + nums[start] + nums[end];

                // Update closest sum if the current is closer to the target
                if (Math.abs(target - currsum) < Math.abs(target - closesum)) {
                    closesum = currsum;
                }

                // Move pointers based on comparison with target
                if (currsum < target) {
                    start++;
                } else if (currsum > target) {
                    end--;
                } else {
                    // If exact match is found, return immediately
                    return target;
                }
            }
        }

        return closesum;
    }
}
