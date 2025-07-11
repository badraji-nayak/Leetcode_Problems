class Solution {
    public int singleNumber(int[] nums) {
        int res = 0; // Step 1: Initialize result as 0
        for(int i = 0; i < nums.length; i++) {
            res = res ^ nums[i]; // Step 2: XOR each element with the result
        }
        return res; // Step 3: The result will be the unique element
    }
}
