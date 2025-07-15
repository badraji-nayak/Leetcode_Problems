class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0; // Pointer for the last unique element
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++; // Move to the next unique position
                nums[i] = nums[j]; // Copy the next unique value
            }
        }
        return i + 1; // Total count of unique elements
    }
}
