class Solution {
    public int thirdMax(int[] nums) {
        long num1 = Long.MIN_VALUE; // Holds the 1st maximum number
        long num2 = Long.MIN_VALUE; // Holds the 2nd maximum number
        long num3 = Long.MIN_VALUE; // Holds the 3rd maximum number

        for (int i = 0; i < nums.length; i++) {
            // Skip if the current number is already considered
            if (nums[i] == num1 && nums[i] == num2 && nums[i] == num3) {
                continue;
            }

            if (nums[i] > num1) {
                // Shift previous max values down
                num3 = num2;
                num2 = num1;
                num1 = nums[i];
            } else if (nums[i] > num2 && nums[i] < num1) {
                // Current number is second maximum
                num3 = num2;
                num2 = nums[i];
            } else if (nums[i] > num3 && nums[i] < num2) {
                // Current number is third maximum
                num3 = nums[i];
            }
        }

        // If third max is not updated, return the maximum
        if (num3 == Long.MIN_VALUE) {
            return (int) num1;
        }

        return (int) num3;
    }
}
